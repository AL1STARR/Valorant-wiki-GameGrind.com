document.querySelector('.search-form').addEventListener('submit', function(e) {
    e.preventDefault();
    const searchTerm = this.query.value;
    if (searchTerm.trim()) {
      // Add your search logic here
      alert(`Searching for: ${searchTerm}`);
      this.reset();
    }
  });

  document.querySelectorAll('.dropdown-toggle').forEach(toggle => {
    toggle.addEventListener('click', (e) => {
        e.stopPropagation();
        const parent = toggle.closest('.dropdown-parent');
        const wasActive = parent.classList.contains('active');
        
        document.querySelectorAll('.dropdown-parent').forEach(p => {
            p.classList.remove('active');
        });
        
        if (!wasActive) {
            parent.classList.add('active');
        }
    });
});

document.addEventListener('click', (e) => {
    document.querySelectorAll('.dropdown-parent').forEach(parent => {
        if (!parent.contains(e.target)) {
            parent.classList.remove('active');
        }
    });
});