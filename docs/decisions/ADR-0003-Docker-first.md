# Decision: Running the application locally for testing and during development

## Result

It was agreed upon a docker-first approach were the whole application is easily started with only one command. Due to the stateless nature of the backends REST-API, a separate deployment outside of docker can still be run for quicker testing during development.

## Need for decision

- Development starts soon and the project will quickly grow.
- Onboarding new developers into existing projects ususally required a lot of installations and often the guides need to be updated with every new onboarding because something is not working again.
- How can we make sure to smoothen this process?

## Considered Options

- Manual Setup: Developers would need to install tools, setup databases, run services one by one, requires time and is often inconsistent
- Docker: Simple start of the whole application; consistent across different machines, similar to the actual deployment already; rebuilding the backend for getting new changes into the container could slow down development, but a local deployment of the backend should also work - check CORS and other security configurations