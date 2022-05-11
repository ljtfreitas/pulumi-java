// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InferenceClusterSsl {
    /**
     * @return The certificate for the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    private final @Nullable String cert;
    /**
     * @return The cname of the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    private final @Nullable String cname;
    /**
     * @return The key content for the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The leaf domain label for the SSL configuration. Conflicts with `ssl.0.cert`,`ssl.0.key`,`ssl.0.cname`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    private final @Nullable String leafDomainLabel;
    /**
     * @return Whether or not to overwrite existing leaf domain. Conflicts with `ssl.0.cert`,`ssl.0.key`,`ssl.0.cname` Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    private final @Nullable Boolean overwriteExistingDomain;

    @CustomType.Constructor
    private InferenceClusterSsl(
        @CustomType.Parameter("cert") @Nullable String cert,
        @CustomType.Parameter("cname") @Nullable String cname,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("leafDomainLabel") @Nullable String leafDomainLabel,
        @CustomType.Parameter("overwriteExistingDomain") @Nullable Boolean overwriteExistingDomain) {
        this.cert = cert;
        this.cname = cname;
        this.key = key;
        this.leafDomainLabel = leafDomainLabel;
        this.overwriteExistingDomain = overwriteExistingDomain;
    }

    /**
     * @return The certificate for the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<String> cert() {
        return Optional.ofNullable(this.cert);
    }
    /**
     * @return The cname of the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<String> cname() {
        return Optional.ofNullable(this.cname);
    }
    /**
     * @return The key content for the SSL configuration.Conflicts with `ssl.0.leaf_domain_label`,`ssl.0.overwrite_existing_domain`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The leaf domain label for the SSL configuration. Conflicts with `ssl.0.cert`,`ssl.0.key`,`ssl.0.cname`. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<String> leafDomainLabel() {
        return Optional.ofNullable(this.leafDomainLabel);
    }
    /**
     * @return Whether or not to overwrite existing leaf domain. Conflicts with `ssl.0.cert`,`ssl.0.key`,`ssl.0.cname` Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Boolean> overwriteExistingDomain() {
        return Optional.ofNullable(this.overwriteExistingDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InferenceClusterSsl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String cname;
        private @Nullable String key;
        private @Nullable String leafDomainLabel;
        private @Nullable Boolean overwriteExistingDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(InferenceClusterSsl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.cname = defaults.cname;
    	      this.key = defaults.key;
    	      this.leafDomainLabel = defaults.leafDomainLabel;
    	      this.overwriteExistingDomain = defaults.overwriteExistingDomain;
        }

        public Builder cert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }
        public Builder cname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder leafDomainLabel(@Nullable String leafDomainLabel) {
            this.leafDomainLabel = leafDomainLabel;
            return this;
        }
        public Builder overwriteExistingDomain(@Nullable Boolean overwriteExistingDomain) {
            this.overwriteExistingDomain = overwriteExistingDomain;
            return this;
        }        public InferenceClusterSsl build() {
            return new InferenceClusterSsl(cert, cname, key, leafDomainLabel, overwriteExistingDomain);
        }
    }
}
