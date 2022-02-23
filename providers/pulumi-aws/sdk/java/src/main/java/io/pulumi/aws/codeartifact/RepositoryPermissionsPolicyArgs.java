// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryPermissionsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryPermissionsPolicyArgs Empty = new RepositoryPermissionsPolicyArgs();

    /**
     * The name of the domain on which to set the resource policy.
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
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @InputImport(name="policyDocument", required=true)
    private final Input<String> policyDocument;

    public Input<String> getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
     * 
     */
    @InputImport(name="policyRevision")
    private final @Nullable Input<String> policyRevision;

    public Input<String> getPolicyRevision() {
        return this.policyRevision == null ? Input.empty() : this.policyRevision;
    }

    /**
     * The name of the repository to set the resource policy on.
     * 
     */
    @InputImport(name="repository", required=true)
    private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    public RepositoryPermissionsPolicyArgs(
        Input<String> domain,
        @Nullable Input<String> domainOwner,
        Input<String> policyDocument,
        @Nullable Input<String> policyRevision,
        Input<String> repository) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.domainOwner = domainOwner;
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyRevision = policyRevision;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private RepositoryPermissionsPolicyArgs() {
        this.domain = Input.empty();
        this.domainOwner = Input.empty();
        this.policyDocument = Input.empty();
        this.policyRevision = Input.empty();
        this.repository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryPermissionsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domain;
        private @Nullable Input<String> domainOwner;
        private Input<String> policyDocument;
        private @Nullable Input<String> policyRevision;
        private Input<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryPermissionsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyRevision = defaults.policyRevision;
    	      this.repository = defaults.repository;
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

        public Builder setPolicyDocument(Input<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }

        public Builder setPolicyDocument(String policyDocument) {
            this.policyDocument = Input.of(Objects.requireNonNull(policyDocument));
            return this;
        }

        public Builder setPolicyRevision(@Nullable Input<String> policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }

        public Builder setPolicyRevision(@Nullable String policyRevision) {
            this.policyRevision = Input.ofNullable(policyRevision);
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
        public RepositoryPermissionsPolicyArgs build() {
            return new RepositoryPermissionsPolicyArgs(domain, domainOwner, policyDocument, policyRevision, repository);
        }
    }
}
