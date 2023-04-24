package pattern.behavior.iterator;

public class Container implements CustomIterable{
    String[] items = {"первый", "второй", "третий", "четвертый", "пятый"};

    @Override
    public ContainerIterator getIterator() {
        return new ContainerIterator();
    }

    private class ContainerIterator implements CustomIterator{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public String next() {
            return items[index++];
        }
    }
}
