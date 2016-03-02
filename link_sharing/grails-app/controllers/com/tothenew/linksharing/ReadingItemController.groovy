import com.tothenew.linksharing.ReadingItem

class ReadingItemController {

    def index() {}

    def executeUpdate(long id,boolean isRead) {
        ReadingItem readingItem = ReadingItem.get(id)
        if (readingItem.executeUpdate("update ReadingItem as RI set RI.isRead=:isRead where RI.id=:id", [isRead:isRead, id: id]))
        {  render "Success"
            render "After updation ${readingItem.isRead}"
        }
        else
            render "Error"


    }

}
