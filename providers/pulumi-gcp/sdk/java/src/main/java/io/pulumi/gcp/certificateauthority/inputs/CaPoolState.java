// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolState extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolState Empty = new CaPoolState();

    /**
     * The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * 
     */
    @InputImport(name="issuancePolicy")
        private final @Nullable Input<CaPoolIssuancePolicyGetArgs> issuancePolicy;

    public Input<CaPoolIssuancePolicyGetArgs> getIssuancePolicy() {
        return this.issuancePolicy == null ? Input.empty() : this.issuancePolicy;
    }

    /**
     * Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name for this CaPool.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * 
     */
    @InputImport(name="publishingOptions")
        private final @Nullable Input<CaPoolPublishingOptionsGetArgs> publishingOptions;

    public Input<CaPoolPublishingOptionsGetArgs> getPublishingOptions() {
        return this.publishingOptions == null ? Input.empty() : this.publishingOptions;
    }

    /**
     * The Tier of this CaPool.
     * Possible values are `ENTERPRISE` and `DEVOPS`.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public CaPoolState(
        @Nullable Input<CaPoolIssuancePolicyGetArgs> issuancePolicy,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<CaPoolPublishingOptionsGetArgs> publishingOptions,
        @Nullable Input<String> tier) {
        this.issuancePolicy = issuancePolicy;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.publishingOptions = publishingOptions;
        this.tier = tier;
    }

    private CaPoolState() {
        this.issuancePolicy = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.publishingOptions = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CaPoolIssuancePolicyGetArgs> issuancePolicy;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<CaPoolPublishingOptionsGetArgs> publishingOptions;
        private @Nullable Input<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuancePolicy = defaults.issuancePolicy;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publishingOptions = defaults.publishingOptions;
    	      this.tier = defaults.tier;
        }

        public Builder setIssuancePolicy(@Nullable Input<CaPoolIssuancePolicyGetArgs> issuancePolicy) {
            this.issuancePolicy = issuancePolicy;
            return this;
        }

        public Builder setIssuancePolicy(@Nullable CaPoolIssuancePolicyGetArgs issuancePolicy) {
            this.issuancePolicy = Input.ofNullable(issuancePolicy);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPublishingOptions(@Nullable Input<CaPoolPublishingOptionsGetArgs> publishingOptions) {
            this.publishingOptions = publishingOptions;
            return this;
        }

        public Builder setPublishingOptions(@Nullable CaPoolPublishingOptionsGetArgs publishingOptions) {
            this.publishingOptions = Input.ofNullable(publishingOptions);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public CaPoolState build() {
            return new CaPoolState(issuancePolicy, labels, location, name, project, publishingOptions, tier);
        }
    }
}
