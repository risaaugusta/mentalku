package mentalku;

public abstract class Data implements Operasi {
    private Double[] suhuBadan = { 91.840, 91.552, 96.000, 90.768, 97.872, 95.376, 97.200, 99.000, 96.168, 95.104, 93.344, 95.856, 98.160, 85.360, 91.040, 94.464, 94.528, 90.832, 90.208, 92.368, 93.760, 93.728, 92.976, 91.072, 91.328, 94.736, 93.856, 94.192, 91.968, 92.208, 98.472, 85.320, 97.608, 89.880, 92.000, 90.896, 98.088, 88.160, 96.672, 88.400, 92.096, 92.560, 93.536, 98.568, 93.328, 88.640, 92.288, 87.080, 95.344, 85.720, 98.760, 94.720, 91.760, 97.104, 95.216, 93.568, 86.920, 91.712, 91.008, 95.696, 87.920, 90.144, 96.960, 92.160, 85.560, 94.048, 98.952, 92.048, 88.920, 97.968, 94.096, 85.240, 95.536, 96.096, 98.208, 87.520, 86.000, 95.296, 91.344, 85.000, 94.128, 94.112, 94.784, 85.840, 92.832, 94.976, 94.480, 94.320, 91.664, 87.800, 92.512, 90.880, 92.800, 89.760, 96.120, 92.320, 87.840, 93.520, 93.696, 90.000, 89.520, 86.520, 96.024, 86.720, 94.704, 92.144, 92.224, 93.920, 86.200, 94.880, 92.896, 85.760, 97.464, 91.408, 92.688, 87.400, 92.864, 93.600, 98.712, 94.992, 95.056, 91.376, 86.640, 95.616, 90.480, 87.640, 87.760, 92.576, 95.440, 86.960, 92.880, 97.680, 86.480, 91.696, 95.936, 98.136, 98.016, 93.808, 85.920, 97.632, 93.136, 90.192, 93.840, 98.592, 92.848, 97.152, 98.256, 96.048, 96.072, 94.064, 91.136, 97.728, 86.080, 85.120, 98.400, 92.464, 91.776, 93.456, 85.400, 88.480, 88.600, 93.056, 95.152, 92.608, 89.240, 93.680, 97.080, 97.368, 89.720, 90.000, 95.920, 93.472, 93.120, 95.632, 94.688, 94.512, 94.864, 87.600, 91.600, 95.776, 95.040, 94.672, 93.904, 95.648, 96.720, 92.704, 97.224, 93.376, 95.408, 93.248, 94.560, 95.456, 85.480, 91.120, 87.880, 97.008, 96.576, 98.184, 92.736, 91.168, 96.816, 96.264, 98.304, 94.000, 85.800, 96.192, 92.768, 89.440, 95.664, 94.416, 95.312, 90.304, 96.288, 98.232, 91.744, 90.992, 97.440, 93.776, 92.528, 92.176, 95.872, 86.360, 97.320, 95.136, 90.016, 85.960, 92.112, 94.000, 86.760, 96.312, 91.520, 86.320, 95.488, 91.392, 97.056, 96.504, 91.152, 87.560, 90.416, 95.328, 87.720, 91.792, 90.592, 88.040, 90.128, 98.448, 90.928, 93.936, 90.160, 90.528, 94.272, 86.560, 92.016, 90.368, 94.224, 91.728, 93.488, 90.464, 87.040, 92.944, 89.840, 90.256, 93.312, 98.328, 97.272, 95.232, 93.744, 90.640, 93.440, 93.792, 88.560, 88.800, 95.712, 96.984, 88.320, 94.384, 93.008, 91.264, 86.160, 91.248, 91.904, 90.448, 96.216, 91.984, 97.344, 94.912, 91.312, 91.200, 91.104, 92.432, 85.600, 97.944, 86.680, 96.528, 87.960, 98.808, 92.912, 95.904, 93.648, 94.624, 90.848, 98.616, 96.600, 91.568, 92.592, 92.256, 85.880, 93.232, 91.456, 98.280, 90.672, 93.104, 95.184, 96.336, 95.360, 98.880, 92.000, 90.960, 90.336, 97.800, 91.488, 85.040, 93.152, 85.080, 91.280, 89.600, 95.520, 93.072, 98.640, 93.408, 86.240, 98.520, 94.208, 90.624, 88.080, 96.744, 94.144, 97.512, 97.248, 91.216, 96.360, 96.408, 92.416, 91.616, 93.264, 86.600, 98.736, 95.888, 91.648, 86.800, 90.096, 89.920, 88.960, 90.688, 87.120, 93.584, 96.000, 88.120, 92.400, 90.176, 93.552, 94.400, 92.640, 93.184, 88.840, 98.544, 90.864, 96.624, 95.792, 91.632, 86.840, 91.856, 92.784, 96.768, 91.360, 94.080, 93.088, 87.240, 97.776, 95.248, 85.200, 95.024, 92.192, 97.848, 90.576, 97.392, 94.608, 95.424, 90.656, 95.008, 89.960, 95.584, 86.120, 94.160, 88.200, 94.368, 98.832, 90.512, 90.912, 90.720, 90.048, 90.752, 85.640, 93.872, 92.272, 90.560, 95.280, 90.432, 91.424, 93.616, 97.920, 87.320, 88.360, 94.448, 94.032, 96.432, 95.824, 86.440, 90.240, 98.928, 94.432, 88.280, 88.000, 97.704, 98.112, 95.200, 95.744, 97.824, 89.680, 97.416, 87.280, 92.656, 98.904, 93.216, 90.544, 93.280, 93.712, 89.320, 91.088, 94.576, 87.360, 94.816, 95.472, 94.240, 92.336, 87.480, 88.440, 90.320, 92.624, 98.856, 95.968, 91.056, 94.496, 90.976, 95.088, 94.592, 94.848, 94.752, 89.480, 93.888, 87.440, 95.504, 89.640, 92.080, 92.992, 94.304, 91.504, 90.816, 93.632, 95.264, 96.240, 98.352, 91.888, 94.352, 96.552, 91.472, 94.960, 98.976, 94.256, 89.200, 97.656, 97.176, 91.680, 92.816, 92.128, 86.040, 94.544, 90.288, 92.304, 89.040, 92.384, 89.280, 92.064, 95.840, 91.296, 96.936, 94.016, 98.496, 97.128, 90.496, 92.352, 85.160, 90.064, 96.480, 97.296, 89.080, 92.032, 85.280, 88.760, 94.176, 93.824, 91.232, 97.752, 94.336, 96.888, 90.272, 98.784, 97.032, 92.752, 94.656, 96.456, 96.840, 89.400, 96.864, 89.000, 94.768, 93.952, 85.680, 90.080, 93.968, 88.680, 97.560, 90.224, 95.984, 98.376, 97.896, 95.680, 87.160, 93.024, 90.704, 96.792, 94.896, 91.024, 89.120, 90.032, 88.520, 92.448, 89.560, 92.496, 90.352, 96.912, 91.584, 92.480, 98.424, 93.504, 90.944, 93.664, 90.784, 89.360, 94.288, 95.600, 98.688, 93.040, 93.296, 91.920, 94.944, 90.112, 91.952, 91.536, 87.000, 89.800, 90.736, 94.832, 95.072, 96.696, 85.520, 90.800, 93.984, 91.440, 85.440 };

    private Double[] limbMovement = { 16.600, 15.880, 10.000, 13.920, 6.496, 9.376, 5.600, 8.000, 4.224, 9.104, 11.344, 9.856, 6.880, 17.144, 14.600, 8.464, 8.528, 14.080, 12.520, 10.368, 11.760, 11.728, 10.976, 14.680, 15.320, 8.736, 11.856, 8.192, 16.920, 10.208, 7.296, 17.128, 6.144, 18.952, 10.000, 14.240, 6.784, 18.264, 4.896, 18.360, 10.096, 10.560, 11.536, 7.424, 11.328, 18.456, 10.288, 17.832, 9.344, 17.288, 7.680, 8.720, 16.400, 5.472, 9.216, 11.568, 17.768, 16.280, 14.520, 9.696, 18.168, 12.360, 5.280, 10.160, 17.224, 8.048, 7.936, 10.048, 18.568, 6.624, 8.096, 17.096, 9.536, 4.128, 6.944, 18.008, 17.400, 9.296, 15.360, 17.000, 8.128, 8.112, 8.784, 17.336, 10.832, 8.976, 8.480, 8.320, 16.160, 18.120, 10.512, 14.200, 10.800, 18.904, 4.160, 10.320, 18.136, 11.520, 11.696, 12.000, 18.808, 17.608, 4.032, 17.688, 8.704, 10.144, 10.224, 11.920, 17.480, 8.880, 10.896, 17.304, 5.952, 15.520, 10.688, 17.960, 10.864, 11.600, 7.616, 8.992, 9.056, 15.440, 17.656, 9.616, 13.200, 18.056, 18.104, 10.576, 9.440, 17.784, 10.880, 6.240, 17.592, 16.240, 9.936, 6.848, 6.688, 11.808, 17.368, 6.176, 11.136, 12.480, 11.840, 7.456, 10.848, 5.536, 7.008, 4.064, 4.096, 8.064, 14.840, 6.304, 17.432, 17.048, 7.200, 10.464, 16.440, 11.456, 17.160, 18.392, 18.440, 11.056, 9.152, 10.608, 18.696, 11.680, 5.440, 5.824, 18.888, 19.000, 9.920, 11.472, 11.120, 9.632, 8.688, 8.512, 8.864, 18.040, 16.000, 9.776, 9.040, 8.672, 11.904, 9.648, 4.960, 10.704, 5.632, 11.376, 9.408, 11.248, 8.560, 9.456, 17.192, 14.800, 18.152, 5.344, 4.768, 6.912, 10.736, 14.920, 5.088, 4.352, 7.072, 12.000, 17.320, 4.256, 10.768, 18.776, 9.664, 8.416, 9.312, 12.760, 4.384, 6.976, 16.360, 14.480, 5.920, 11.776, 10.528, 10.176, 9.872, 17.544, 5.760, 9.136, 12.040, 17.384, 10.112, 8.000, 17.704, 4.416, 15.800, 17.528, 9.488, 15.480, 5.408, 4.672, 14.880, 18.024, 13.040, 9.328, 18.088, 16.480, 13.480, 18.216, 12.320, 7.264, 14.320, 11.936, 12.400, 13.320, 8.272, 17.624, 10.016, 12.920, 8.224, 16.320, 11.488, 13.160, 17.816, 10.944, 18.936, 12.640, 11.312, 7.104, 5.696, 9.232, 11.744, 13.600, 11.440, 11.792, 18.424, 18.520, 9.712, 5.312, 18.328, 8.384, 11.008, 15.160, 17.464, 15.120, 16.760, 13.120, 4.288, 16.960, 5.792, 8.912, 15.280, 15.000, 14.760, 10.432, 17.240, 6.592, 17.672, 4.704, 18.184, 7.744, 10.912, 9.904, 11.648, 8.624, 14.120, 7.488, 4.800, 15.920, 10.592, 10.256, 17.352, 11.232, 15.640, 7.040, 13.680, 11.104, 9.184, 4.448, 9.360, 7.840, 17.000, 14.400, 12.840, 6.400, 15.720, 17.016, 11.152, 17.032, 15.200, 18.840, 9.520, 11.072, 7.520, 11.408, 17.496, 7.360, 8.208, 13.560, 18.232, 4.992, 8.144, 6.016, 5.664, 15.040, 4.480, 4.544, 10.416, 16.040, 11.264, 17.640, 7.648, 9.888, 16.120, 17.720, 12.240, 18.968, 18.584, 13.720, 17.848, 11.584, 4.000, 18.248, 10.400, 12.440, 11.552, 8.400, 10.640, 11.184, 18.536, 7.392, 14.160, 4.832, 9.792, 16.080, 17.736, 16.640, 10.784, 5.024, 15.400, 8.080, 11.088, 17.896, 6.368, 9.248, 17.080, 9.024, 10.192, 6.464, 13.440, 5.856, 8.608, 9.424, 13.640, 9.008, 18.984, 9.584, 17.448, 8.160, 18.280, 8.368, 7.776, 13.280, 14.280, 13.800, 12.120, 13.880, 17.256, 11.872, 10.272, 13.400, 9.280, 13.080, 15.560, 11.616, 6.560, 17.928, 18.344, 8.448, 8.032, 4.576, 9.824, 17.576, 12.600, 7.904, 8.432, 18.312, 18.200, 6.272, 6.816, 9.200, 9.744, 6.432, 18.872, 5.888, 17.912, 10.656, 7.872, 11.216, 13.360, 11.280, 11.712, 18.728, 14.720, 8.576, 17.944, 8.816, 9.472, 8.240, 10.336, 17.992, 18.376, 12.800, 10.624, 7.808, 9.968, 14.640, 8.496, 14.440, 9.088, 8.592, 8.848, 8.752, 18.792, 11.888, 17.976, 9.504, 18.856, 10.080, 10.992, 8.304, 15.760, 14.040, 11.632, 9.264, 4.320, 7.136, 16.720, 8.352, 4.736, 15.680, 8.960, 7.968, 8.256, 18.680, 6.208, 5.568, 16.200, 10.816, 10.128, 17.416, 8.544, 12.720, 10.304, 18.616, 10.384, 18.712, 10.064, 9.840, 15.240, 5.248, 8.016, 7.328, 5.504, 13.240, 10.352, 17.064, 12.160, 4.640, 5.728, 18.632, 10.032, 17.112, 18.504, 8.176, 11.824, 15.080, 6.336, 8.336, 5.184, 12.680, 7.712, 5.376, 10.752, 8.656, 4.608, 5.120, 18.760, 5.152, 18.600, 8.768, 11.952, 17.272, 12.200, 11.968, 18.472, 6.080, 12.560, 9.984, 7.168, 6.528, 9.680, 17.864, 11.024, 13.760, 5.056, 8.896, 14.560, 18.648, 12.080, 18.408, 10.448, 18.824, 10.496, 12.880, 5.216, 15.960, 10.480, 7.232, 11.504, 14.360, 11.664, 13.960, 18.744, 8.288, 9.600, 7.584, 11.040, 11.296, 16.800, 8.944, 12.280, 16.880, 15.840, 17.800, 18.920, 13.840, 8.832, 9.072, 4.928, 17.208, 14.000, 11.984, 15.600, 17.176 };

    private Double[] oksigenDarah = { 89.840, 89.552, 95.000, 88.768, 96.248, 94.064, 95.800, 97.000, 95.112, 93.656, 91.344, 94.784, 96.440, 82.432, 89.040, 92.696, 92.792, 88.832, 88.208, 90.368, 91.760, 91.728, 90.976, 89.072, 89.328, 93.104, 91.856, 92.288, 89.968, 90.208, 96.648, 82.384, 96.072, 87.856, 90.000, 88.896, 96.392, 85.792, 95.448, 86.080, 90.096, 90.560, 91.536, 96.712, 91.328, 86.368, 90.288, 84.496, 94.016, 82.864, 96.840, 93.080, 89.760, 95.736, 93.824, 91.568, 84.304, 89.712, 89.008, 94.544, 85.504, 88.144, 95.640, 90.160, 82.672, 92.072, 96.968, 90.048, 86.704, 96.312, 92.144, 82.288, 94.304, 95.064, 96.472, 85.024, 83.200, 93.944, 89.344, 82.000, 92.192, 92.168, 93.176, 83.008, 90.832, 93.464, 92.720, 92.480, 89.664, 85.360, 90.512, 88.880, 90.800, 87.712, 95.080, 90.320, 85.408, 91.520, 91.696, 88.000, 87.424, 83.824, 95.016, 84.064, 93.056, 90.144, 90.224, 91.920, 83.440, 93.320, 90.896, 82.912, 95.976, 89.408, 90.688, 84.880, 90.864, 91.600, 96.808, 93.488, 93.584, 89.376, 83.968, 94.424, 88.480, 85.168, 85.312, 90.576, 94.160, 84.352, 90.880, 96.120, 83.776, 89.696, 94.904, 96.424, 96.344, 91.808, 83.104, 96.088, 91.136, 88.192, 91.840, 96.728, 90.848, 95.768, 96.504, 95.032, 95.048, 92.096, 89.136, 96.152, 83.296, 82.144, 96.600, 90.464, 89.776, 91.456, 82.480, 86.176, 86.320, 91.056, 93.728, 90.608, 87.088, 91.680, 95.720, 95.912, 87.664, 88.000, 94.880, 91.472, 91.120, 94.448, 93.032, 92.768, 93.296, 85.120, 89.600, 94.664, 93.560, 93.008, 91.904, 94.472, 95.480, 90.704, 95.816, 91.376, 94.112, 91.248, 92.840, 94.184, 82.576, 89.120, 85.456, 95.672, 95.384, 96.456, 90.736, 89.168, 95.544, 95.176, 96.536, 92.000, 82.960, 95.128, 90.768, 87.328, 94.496, 92.624, 93.968, 88.304, 95.192, 96.488, 89.744, 88.992, 95.960, 91.776, 90.528, 90.176, 94.808, 83.632, 95.880, 93.704, 88.016, 83.152, 90.112, 92.000, 84.112, 95.208, 89.520, 83.584, 94.232, 89.392, 95.704, 95.336, 89.152, 85.072, 88.416, 93.992, 85.264, 89.792, 88.592, 85.648, 88.128, 96.632, 88.928, 91.936, 88.160, 88.528, 92.408, 83.872, 90.016, 88.368, 92.336, 89.728, 91.488, 88.464, 84.448, 90.944, 87.808, 88.256, 91.312, 96.552, 95.848, 93.848, 91.744, 88.640, 91.440, 91.792, 86.272, 86.560, 94.568, 95.656, 85.984, 92.576, 91.008, 89.264, 83.392, 89.248, 89.904, 88.448, 95.144, 89.984, 95.896, 93.368, 89.312, 89.200, 89.104, 90.432, 82.720, 96.296, 84.016, 95.352, 85.552, 96.872, 90.912, 94.856, 91.648, 92.936, 88.848, 96.744, 95.400, 89.568, 90.592, 90.256, 83.056, 91.232, 89.456, 96.520, 88.672, 91.104, 93.776, 95.224, 94.040, 96.920, 90.000, 88.960, 88.336, 96.200, 89.488, 82.048, 91.152, 82.096, 89.280, 87.520, 94.280, 91.072, 96.760, 91.408, 83.488, 96.680, 92.312, 88.624, 85.696, 95.496, 92.216, 96.008, 95.832, 89.216, 95.240, 95.272, 90.416, 89.616, 91.264, 83.920, 96.824, 94.832, 89.648, 84.160, 88.096, 87.904, 86.752, 88.688, 84.544, 91.584, 95.000, 85.744, 90.400, 88.176, 91.552, 92.600, 90.640, 91.184, 86.608, 96.696, 88.864, 95.416, 94.688, 89.632, 84.208, 89.856, 90.784, 95.512, 89.360, 92.120, 91.088, 84.688, 96.184, 93.872, 82.240, 93.536, 90.192, 96.232, 88.576, 95.928, 92.912, 94.136, 88.656, 93.512, 87.952, 94.376, 83.344, 92.240, 85.840, 92.552, 96.888, 88.512, 88.912, 88.720, 88.048, 88.752, 82.768, 91.872, 90.272, 88.560, 93.920, 88.432, 89.424, 91.616, 96.280, 84.784, 86.032, 92.672, 92.048, 95.288, 94.736, 83.728, 88.240, 96.952, 92.648, 85.936, 85.600, 96.136, 96.408, 93.800, 94.616, 96.216, 87.616, 95.944, 84.736, 90.656, 96.936, 91.216, 88.544, 91.280, 91.712, 87.184, 89.088, 92.864, 84.832, 93.224, 94.208, 92.360, 90.336, 84.976, 86.128, 88.320, 90.624, 96.904, 94.952, 89.056, 92.744, 88.976, 93.632, 92.888, 93.272, 93.128, 87.376, 91.888, 84.928, 94.256, 87.568, 90.080, 90.992, 92.456, 89.504, 88.816, 91.632, 93.896, 95.160, 96.568, 89.888, 92.528, 95.368, 89.472, 93.440, 96.984, 92.384, 87.040, 96.104, 95.784, 89.680, 90.816, 90.128, 83.248, 92.816, 88.288, 90.304, 86.848, 90.384, 87.136, 90.064, 94.760, 89.296, 95.624, 92.024, 96.664, 95.752, 88.496, 90.352, 82.192, 88.064, 95.320, 95.864, 86.896, 90.032, 82.336, 86.512, 92.264, 91.824, 89.232, 96.168, 92.504, 95.592, 88.272, 96.856, 95.688, 90.752, 92.984, 95.304, 95.560, 87.280, 95.576, 86.800, 93.152, 91.952, 82.816, 88.080, 91.968, 86.416, 96.040, 88.224, 94.976, 96.584, 96.264, 94.520, 84.592, 91.024, 88.704, 95.528, 93.344, 89.024, 86.944, 88.032, 86.224, 90.448, 87.472, 90.496, 88.352, 95.608, 89.584, 90.480, 96.616, 91.504, 88.944, 91.664, 88.784, 87.232, 92.432, 94.400, 96.792, 91.040, 91.296, 89.920, 93.416, 88.112, 89.952, 89.536, 84.400, 87.760, 88.736, 93.248, 93.608, 95.464, 82.624, 88.800, 91.984, 89.440, 82.528 };

    private Double[] detakJantung = { 74.200, 72.760, 60.000, 68.840, 53.120, 58.440, 52.000, 55.000, 50.280, 57.760, 63.360, 59.640, 53.600, 75.720, 70.200, 56.160, 56.320, 69.160, 66.040, 60.920, 64.400, 64.320, 62.440, 70.360, 71.640, 56.840, 64.640, 55.480, 74.840, 60.520, 54.120, 75.640, 52.680, 84.760, 60.000, 69.480, 53.480, 81.320, 51.120, 81.800, 60.240, 61.400, 63.840, 54.280, 63.320, 82.280, 60.720, 79.160, 58.360, 76.440, 54.600, 56.800, 73.800, 51.840, 58.040, 63.920, 78.840, 73.560, 70.040, 59.240, 80.840, 65.720, 51.600, 60.400, 76.120, 55.120, 54.920, 60.120, 82.840, 53.280, 55.240, 75.480, 58.840, 50.160, 53.680, 80.040, 77.000, 58.240, 71.720, 75.000, 55.320, 55.280, 56.960, 76.680, 62.080, 57.440, 56.200, 55.800, 73.320, 80.600, 61.280, 69.400, 62.000, 84.520, 50.200, 60.800, 80.680, 63.800, 64.240, 65.000, 84.040, 78.040, 50.040, 78.440, 56.760, 60.360, 60.560, 64.800, 77.400, 57.200, 62.240, 76.520, 52.440, 72.040, 61.720, 79.800, 62.160, 64.000, 54.520, 57.480, 57.640, 71.880, 78.280, 59.040, 67.400, 80.280, 80.520, 61.440, 58.600, 78.920, 62.200, 52.800, 77.960, 73.480, 59.840, 53.560, 53.360, 64.520, 76.840, 52.720, 62.840, 65.960, 64.600, 54.320, 62.120, 51.920, 53.760, 50.080, 50.120, 55.160, 70.680, 52.880, 77.160, 75.240, 54.000, 61.160, 73.880, 63.640, 75.800, 81.960, 82.200, 62.640, 57.880, 61.520, 83.480, 64.200, 51.800, 52.280, 84.440, 85.000, 59.800, 63.680, 62.800, 59.080, 56.720, 56.280, 57.160, 80.200, 73.000, 59.440, 57.600, 56.680, 64.760, 59.120, 51.200, 61.760, 52.040, 63.440, 58.520, 63.120, 56.400, 58.640, 75.960, 70.600, 80.760, 51.680, 50.960, 53.640, 61.840, 70.840, 51.360, 50.440, 53.840, 65.000, 76.600, 50.320, 61.920, 83.880, 59.160, 56.040, 58.280, 66.520, 50.480, 53.720, 73.720, 69.960, 52.400, 64.440, 61.320, 60.440, 59.680, 77.720, 52.200, 57.840, 65.080, 76.920, 60.280, 55.000, 78.520, 50.520, 72.600, 77.640, 58.720, 71.960, 51.760, 50.840, 70.760, 80.120, 67.080, 58.320, 80.440, 73.960, 67.960, 81.080, 65.640, 54.080, 69.640, 64.840, 65.800, 67.640, 55.680, 78.120, 60.040, 66.840, 55.560, 73.640, 63.720, 67.320, 79.080, 62.360, 84.680, 66.280, 63.280, 53.880, 52.120, 58.080, 64.360, 68.200, 63.600, 64.480, 82.120, 82.600, 59.280, 51.640, 81.640, 55.960, 62.520, 71.320, 77.320, 71.240, 74.520, 67.240, 50.360, 74.920, 52.240, 57.280, 71.560, 71.000, 70.520, 61.080, 76.200, 53.240, 78.360, 50.880, 80.920, 54.680, 62.280, 59.760, 64.120, 56.560, 69.240, 54.360, 51.000, 72.840, 61.480, 60.640, 76.760, 63.080, 72.280, 53.800, 68.360, 62.760, 57.960, 50.560, 58.400, 54.800, 75.000, 69.800, 66.680, 53.000, 72.440, 75.080, 62.880, 75.160, 71.400, 84.200, 58.800, 62.680, 54.400, 63.520, 77.480, 54.200, 55.520, 68.120, 81.160, 51.240, 55.360, 52.520, 52.080, 71.080, 50.600, 50.680, 61.040, 73.080, 63.160, 78.200, 54.560, 59.720, 73.240, 78.600, 65.480, 84.840, 82.920, 68.440, 79.240, 63.960, 50.000, 81.240, 61.000, 65.880, 63.880, 56.000, 61.600, 62.960, 82.680, 54.240, 69.320, 51.040, 59.480, 73.160, 78.680, 74.280, 61.960, 51.280, 71.800, 55.200, 62.720, 79.480, 52.960, 58.120, 75.400, 57.560, 60.480, 53.080, 67.880, 52.320, 56.520, 58.560, 68.280, 57.520, 84.920, 58.960, 77.240, 55.400, 81.400, 55.920, 54.720, 67.560, 69.560, 68.600, 65.240, 68.760, 76.280, 64.680, 60.680, 67.800, 58.200, 67.160, 72.120, 64.040, 53.200, 79.640, 81.720, 56.120, 55.080, 50.720, 59.560, 77.880, 66.200, 54.880, 56.080, 81.560, 81.000, 52.840, 53.520, 58.000, 59.360, 53.040, 84.360, 52.360, 79.560, 61.640, 54.840, 63.040, 67.720, 63.200, 64.280, 83.640, 70.440, 56.440, 79.720, 57.040, 58.680, 55.600, 60.840, 79.960, 81.880, 66.600, 61.560, 54.760, 59.920, 70.280, 56.240, 69.880, 57.720, 56.480, 57.120, 56.880, 83.960, 64.720, 79.880, 58.760, 84.280, 60.200, 62.480, 55.760, 72.520, 69.080, 64.080, 58.160, 50.400, 53.920, 74.440, 55.880, 50.920, 72.360, 57.400, 54.960, 55.640, 83.400, 52.760, 51.960, 73.400, 62.040, 60.320, 77.080, 56.360, 66.440, 60.760, 83.080, 60.960, 83.560, 60.160, 59.600, 71.480, 51.560, 55.040, 54.160, 51.880, 67.480, 60.880, 75.320, 65.320, 50.800, 52.160, 83.160, 60.080, 75.560, 82.520, 55.440, 64.560, 71.160, 52.920, 55.840, 51.480, 66.360, 54.640, 51.720, 61.880, 56.640, 50.760, 51.400, 83.800, 51.440, 83.000, 56.920, 64.880, 76.360, 65.400, 64.920, 82.360, 52.600, 66.120, 59.960, 53.960, 53.160, 59.200, 79.320, 62.560, 68.520, 51.320, 57.240, 70.120, 83.240, 65.160, 82.040, 61.120, 84.120, 61.240, 66.760, 51.520, 72.920, 61.200, 54.040, 63.760, 69.720, 64.160, 68.920, 83.720, 55.720, 59.000, 54.480, 62.600, 63.240, 74.600, 57.360, 65.560, 74.760, 72.680, 79.000, 84.600, 68.680, 57.080, 57.680, 51.160, 76.040, 69.000, 64.960, 72.200, 75.880 };

    private int[] levelStress = { 3, 3, 1, 3, 0, 1, 0, 0, 0, 1, 2, 1, 0, 4, 3, 1, 1, 3, 3, 2, 2, 2, 2, 3, 3, 1, 2, 1, 3, 2, 0, 4, 0, 4, 2, 3, 0, 4, 0, 4, 2, 2, 2, 0, 2, 4, 2, 4, 1, 4, 0, 1, 3, 0, 1, 2, 4, 3, 3, 1, 4, 3, 0, 2, 4, 1, 0, 2, 4, 0, 1, 4, 1, 0, 0, 4, 4, 1, 3, 4, 1, 1, 1, 4, 2, 1, 1, 1, 3, 4, 2, 3, 2, 4, 0, 2, 4, 2, 2, 3, 4, 4, 0, 4, 1, 2, 2, 2, 4, 1, 2, 4, 0, 3, 2, 4, 2, 2, 0, 1, 1, 3, 4, 1, 3, 4, 4, 2, 1, 4, 2, 0, 4, 3, 1, 0, 0, 2, 4, 0, 2, 3, 2, 0, 2, 0, 0, 0, 0, 1, 3, 0, 4, 4, 0, 2, 3, 2, 4, 4, 4, 2, 1, 2, 4, 2, 0, 0, 4, 4, 1, 2, 2, 1, 1, 1, 1, 4, 3, 1, 1, 1, 2, 1, 0, 2, 0, 2, 1, 2, 1, 1, 4, 3, 4, 0, 0, 0, 2, 3, 0, 0, 0, 2, 4, 0, 2, 4, 1, 1, 1, 3, 0, 0, 3, 3, 0, 2, 2, 2, 1, 4, 0, 1, 3, 4, 2, 1, 4, 0, 3, 4, 1, 3, 0, 0, 3, 4, 3, 1, 4, 3, 3, 4, 3, 0, 3, 2, 3, 3, 1, 4, 2, 3, 1, 3, 2, 3, 4, 2, 4, 3, 2, 0, 0, 1, 2, 3, 2, 2, 4, 4, 1, 0, 4, 1, 2, 3, 4, 3, 3, 3, 0, 3, 0, 1, 3, 3, 3, 2, 4, 0, 4, 0, 4, 0, 2, 1, 2, 1, 3, 0, 0, 3, 2, 2, 4, 2, 3, 0, 3, 2, 1, 0, 1, 0, 3, 3, 3, 0, 3, 4, 2, 4, 3, 4, 1, 2, 0, 2, 4, 0, 1, 3, 4, 0, 1, 0, 0, 3, 0, 0, 2, 3, 2, 4, 0, 1, 3, 4, 3, 4, 4, 3, 4, 2, 0, 4, 2, 3, 2, 1, 2, 2, 4, 0, 3, 0, 1, 3, 4, 3, 2, 0, 3, 1, 2, 4, 0, 1, 4, 1, 2, 0, 3, 0, 1, 1, 3, 1, 4, 1, 4, 1, 4, 1, 0, 3, 3, 3, 3, 3, 4, 2, 2, 3, 1, 3, 3, 2, 0, 4, 4, 1, 1, 0, 1, 4, 3, 0, 1, 4, 4, 0, 0, 1, 1, 0, 4, 0, 4, 2, 0, 2, 3, 2, 2, 4, 3, 1, 4, 1, 1, 1, 2, 4, 4, 3, 2, 0, 1, 3, 1, 3, 1, 1, 1, 1, 4, 2, 4, 1, 4, 2, 2, 1, 3, 3, 2, 1, 0, 0, 3, 1, 0, 3, 1, 0, 1, 4, 0, 0, 3, 2, 2, 4, 1, 3, 2, 4, 2, 4, 2, 1, 3, 0, 1, 0, 0, 3, 2, 4, 3, 0, 0, 4, 2, 4, 4, 1, 2, 3, 0, 1, 0, 3, 0, 0, 2, 1, 0, 0, 4, 0, 4, 1, 2, 4, 3, 2, 4, 0, 3, 1, 0, 0, 1, 4, 2, 3, 0, 1, 3, 4, 3, 4, 2, 4, 2, 3, 0, 3, 2, 0, 2, 3, 2, 3, 4, 1, 1, 0, 2, 2, 3, 1, 3, 3, 3, 4, 4, 3, 1, 1, 0, 4, 3, 2, 3, 4 };

    private int[] frekuensiPrediksiYa = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private int[] frekuensiPrediksiTidak = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private int totalSampel = 0;
    private int totalSampelYa = 0;
    private int totalSampelTidak = 0;

    // Method untuk melatih dengan melakukan normalisasi dan perhitungan frekuensi data latih
    protected void setFrekuensiPrediksi() {
        this.totalSampel = levelStress.length;
        for (int i = 0; i < levelStress.length; i++) {
            if (levelStress[i] > 1) {
                this.totalSampelYa++;
            }

            String a;
            if(i % 2 == 0){
                a = "..";
            } else if (i % 3 == 0){
                a = "...";
            } else{
                a = ".";
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(i+1 + " Data telah digenerasi" + a);
            System.out.println();

            if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[0] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[1] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[2] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[3] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[4] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[5] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[6] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[7] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[8] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[9] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[10] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[11] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[12] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[13] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[14] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] > 1) {
                this.frekuensiPrediksiYa[15] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[0] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[1] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[2] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[3] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[4] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[5] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[6] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[7] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[8] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[9] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[10] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] < 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[11] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] <= 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[12] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] <= 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[13] += 1;
            } else if (limbMovement[i] > 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[14] += 1;
            } else if (limbMovement[i] <= 10.000 && suhuBadan[i] > 97.000 && oksigenDarah[i] > 95.000
                    && detakJantung[i] >= 60.000 && levelStress[i] <= 1) {
                this.frekuensiPrediksiTidak[15] += 1;
            }
        }
    }

    // Method getter untuk total sampel
    protected int getTotalSampel() {
        return this.totalSampel;
    }

    // Method getter untuk total sampel tidak cemas 
    protected int getTotalSampel(int totalSampel) {
        this.totalSampelTidak = totalSampel - this.totalSampelYa;
        return this.totalSampelTidak;
    }

    // Method getter untuk total sampel cemas
    protected int getTotalSampel(int totalSampelTidak, int totalSampel) {
        this.totalSampelYa = totalSampel - totalSampelTidak;
        return this.totalSampelYa;
    }

    // Method getter untuk frekuensi semua kelas dengan output cemas
    protected int[] getFrekuensiPrediksiYa() {
        return this.frekuensiPrediksiYa;
    }

    // Method getter untuk frekuensi perkelas (sesuai input index) dengan output cemas
    protected int getFrekuensiPrediksiYa(int index) {
        return this.frekuensiPrediksiYa[index];
    }

    // Method getter untuk frekuensi semua kelas dengan output tidak cemas
    protected int[] getFrekuensiPrediksiTidak() {
        return this.frekuensiPrediksiTidak;
    }

    // Method getter untuk frekuensi perkelas (sesuai input index) dengan output tidak cemas
    protected int getFrekuensiPrediksiTidak(int index) {
        return this.frekuensiPrediksiTidak[index];
    }
}
