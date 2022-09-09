package RedBlackTree;


public class Main {

    /**
     * Реализация достаточно сложная, поэтому я опишу лишь концепцию для создания алгоритма.
     *
     * Общая концепция(кратко):
     * 1. Допустимое взаиморасположение узлов разных цветов определяется набором правил, называемых красно-черными правилами
     * 2. Эти правила применяются при вставке (и удалении) узлов.
     * 3. Переключение цветов превращает черный узел с двумя красными потомками в красный узел с двумя черными потомками.
     *
     *    Повороты:
     * 4. При правом повороте верхний узел перемещается в позицию правого потомка, а левый потомок занимает его прежнее место.
     * 5. При левом повороте верхний узел перемещается в позицию левого потомка, а правый потомок занимает его прежнее место.
     *
     *    Общие правила:
     * 6. В ходе определения позиции для вставки нового узла выполняются переключения цветов, а в некоторых случаях и повороты.
     * Переключение просто возвращает дерево к состоянию красно-черной правильности после выполнения вставки.
     * 7. После вставки нового узла снова производится проверка возможных конфликтов типа «красный-красный». Если будет обнаружено нарушение, выполняются
     * повторы, возвращающие дерево к состоянию красно-черной правильности.
     * 8. Корень всегда остаётся чёрным.
     * 9. Так же стоит упомянуть, что может перемещаться целое поддерево на другую ветку, если в этом будет необходимость.
     *
     *
     *  Моё небольшое описание:
     * С помощью данных правил гарантируется балансировка дерева (избегание слишком большого количества значений на одной ветке)
     * повороты совершаются при обнаружение значений красный-красный, это необходимо для балансировки, так у нас не будет скапливатся
     * много значений на одной ветке и они не смогут создать вырождение эффективности дерева, когда все значения находятся на одной ветке.
     * Цвета проверяются и переключаются сверху вниз при каждой вставке, удаление.
     *
     * ************************
     *
     * В красно-черных деревьях, как и в обычных деревьях двоичного поиска, операции поиска, вставки и удаления выполняются за время O(log2N)
     * Благодаря переключению цветов на пути сверху вниз вставка в красно-черных
     * деревьях отличается большей эффективностью по сравнению с другими сбалансированными деревьями (например, AVL-деревьями). Они гарантируют, что одного
     * прохода сверху вниз по дереву будет достаточно.
     *
     */
    public static void main(String[] args) {

    }
}
