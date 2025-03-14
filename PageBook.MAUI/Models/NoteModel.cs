using SQLite;

namespace PageBook.Models;

public class Note
{
    [PrimaryKey]
    public string Id { get; set; }
    public string Title { get; set; }
    public string Content { get; set; }
    public DateTime CreatedAt { get; set; }
    public DateTime ModifiedAt { get; set; }
    public string Tags { get; set; }
}