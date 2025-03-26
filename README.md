# PageBook
PageBook - это кроссплатформенное приложение для работы со справочными материалами и заметками. Основная версия разработана с использованием .NET MAUI, а также теперь включает нативную Android-реализацию на Kotlin для максимальной производительности на мобильных устройствах.

# Основные возможности
### Гибкость разработки:
- .NET MAUI версия для полной кроссплатформенности (Windows, macOS, iOS, Android)
- Нативная Android версия на Kotlin для оптимальной производительности
### Функционал заметок:
- Создание и редактирование с поддержкой форматирования
- Организация по категориям и тегам
- Синхронизация между платформами
# Технические особенности
### .NET MAUI версия
- Единая кодобаза для всех платформ
- Использование XAML для UI
- MVVM архитектура
### Нативная Android версия
- Разработана на Kotlin
- Оптимизирована под Android API
- Использует Jetpack Compose для современного UI

# Структура проекта
```bash
PageBook/  
├── MAUI/                  # .NET MAUI реализация  
│   ├── App.xaml
│   ├── App.xaml.cs
│   ├── AppShell.xaml
│   ├── AppShell.xaml.cs
│   ├── ServiceRegistration.cs
│   ├── Models/
│   │   └── NoteModel.cs
│   │   └── ToDoModel.cs
│   ├── Services/
│   │   ├── FormattingService.cs
│   │   ├── ToDoStorageService.cs
│   │   └── NoteStorageService.cs
│   ├── ViewModels/
│   │   ├── EditorViewModel.cs
│   │   ├── ToDoListViewModel.cs
│   │   ├── ToDoEditorViewModel.cs
│   │   └── MainViewModel.cs
│   └── Views/
│       ├── EditorPage.xaml
│       ├── EditorPage.xaml.cs
│       ├── ToDoEditorPage.xaml
│       ├── ToDoEditorPage.xaml.cs
│       ├── ToDoListPage.xaml
│       ├── ToDoListPage.xaml.cs
│       ├── MainPage.xaml
│       └── MainPage.xaml.cs
└── AndroidNative/         # Нативная Android реализация  
    ├── app/  
    │   ├── src/main/  
    │   │   ├── java/com/pagebook/  
    │   │   │   ├── convecters/       # DI модули  
    │   │   │   ├── models/  
    │   │   │   ├── storage/  
    │   │   │   ├── ui/       # Активности и фрагменты  
    │   │   └── res/          # Ресурсы  
    │   └── build.gradle  
    └── settings.gradle  
```
# Возможности для участия
### Приветствуются контрибьютеры для:
- Развития обеих версий (MAUI и Kotlin)
- Реализации синхронизации между платформами
- Улучшения UI/UX
- Оптимизации производительности
### Особенно востребована помощь в:
- Адаптации фич MAUI-версии в нативную Android
- Реализации общего бэкенда
- Тестировании на различных устройствах
### Проект открыт для pull requests и обсуждений!
