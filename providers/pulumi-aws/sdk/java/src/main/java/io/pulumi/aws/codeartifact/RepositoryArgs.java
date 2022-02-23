// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact;

import io.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs;
import io.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The description of the repository.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The domain that contains the created repository.
     * 
     */
    @InputImport(name="domain", required=true)
    private final Input<String> domain;

    public Input<String> getDomain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @InputImport(name="domainOwner")
    private final @Nullable Input<String> domainOwner;

    public Input<String> getDomainOwner() {
        return this.domainOwner == null ? Input.empty() : this.domainOwner;
    }

    /**
     * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * 
     */
    @InputImport(name="externalConnections")
    private final @Nullable Input<RepositoryExternalConnectionsArgs> externalConnections;

    public Input<RepositoryExternalConnectionsArgs> getExternalConnections() {
        return this.externalConnections == null ? Input.empty() : this.externalConnections;
    }

    /**
     * The name of the repository to create.
     * 
     */
    @InputImport(name="repository", required=true)
    private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * 
     */
    @InputImport(name="upstreams")
    private final @Nullable Input<List<RepositoryUpstreamArgs>> upstreams;

    public Input<List<RepositoryUpstreamArgs>> getUpstreams() {
        return this.upstreams == null ? Input.empty() : this.upstreams;
    }

    public RepositoryArgs(
        @Nullable Input<String> description,
        Input<String> domain,
        @Nullable Input<String> domainOwner,
        @Nullable Input<RepositoryExternalConnectionsArgs> externalConnections,
        Input<String> repository,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<RepositoryUpstreamArgs>> upstreams) {
        this.description = description;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.domainOwner = domainOwner;
        this.externalConnections = externalConnections;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tags = tags;
        this.upstreams = upstreams;
    }

    private RepositoryArgs() {
        this.description = Input.empty();
        this.domain = Input.empty();
        this.domainOwner = Input.empty();
        this.externalConnections = Input.empty();
        this.repository = Input.empty();
        this.tags = Input.empty();
        this.upstreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> domain;
        private @Nullable Input<String> domainOwner;
        private @Nullable Input<RepositoryExternalConnectionsArgs> externalConnections;
        private Input<String> repository;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<RepositoryUpstreamArgs>> upstreams;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.externalConnections = defaults.externalConnections;
    	      this.repository = defaults.repository;
    	      this.tags = defaults.tags;
    	      this.upstreams = defaults.upstreams;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDomain(Input<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
            return this;
        }

        public Builder setDomainOwner(@Nullable Input<String> domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }

        public Builder setDomainOwner(@Nullable String domainOwner) {
            this.domainOwner = Input.ofNullable(domainOwner);
            return this;
        }

        public Builder setExternalConnections(@Nullable Input<RepositoryExternalConnectionsArgs> externalConnections) {
            this.externalConnections = externalConnections;
            return this;
        }

        public Builder setExternalConnections(@Nullable RepositoryExternalConnectionsArgs externalConnections) {
            this.externalConnections = Input.ofNullable(externalConnections);
            return this;
        }

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUpstreams(@Nullable Input<List<RepositoryUpstreamArgs>> upstreams) {
            this.upstreams = upstreams;
            return this;
        }

        public Builder setUpstreams(@Nullable List<RepositoryUpstreamArgs> upstreams) {
            this.upstreams = Input.ofNullable(upstreams);
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(description, domain, domainOwner, externalConnections, repository, tags, upstreams);
        }
    }
}
