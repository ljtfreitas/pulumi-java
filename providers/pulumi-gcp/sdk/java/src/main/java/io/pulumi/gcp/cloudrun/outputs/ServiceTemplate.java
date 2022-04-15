// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateMetadata;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpec;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplate {
    /**
     * Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServiceTemplateMetadata metadata;
    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * Structure is documented below.
     * 
     */
    private final @Nullable ServiceTemplateSpec spec;

    @CustomType.Constructor
    private ServiceTemplate(
        @CustomType.Parameter("metadata") @Nullable ServiceTemplateMetadata metadata,
        @CustomType.Parameter("spec") @Nullable ServiceTemplateSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    /**
     * Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
    */
    public Optional<ServiceTemplateMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * Structure is documented below.
     * 
    */
    public Optional<ServiceTemplateSpec> spec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTemplateMetadata metadata;
        private @Nullable ServiceTemplateSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(@Nullable ServiceTemplateMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder spec(@Nullable ServiceTemplateSpec spec) {
            this.spec = spec;
            return this;
        }        public ServiceTemplate build() {
            return new ServiceTemplate(metadata, spec);
        }
    }
}
