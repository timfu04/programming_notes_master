from flask import Flask

# Define Flask app object first before importing others to avoid circular imports
app = Flask(__name__)

from app import views
from app import admin_views
