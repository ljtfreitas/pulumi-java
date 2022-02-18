// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes parameters for creating application-scoped volumes provided by Service Fabric Volume Disks
 * 
 */
public final class ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse Empty = new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse();

    /**
     * User readable description of the volume.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Specifies the application-scoped volume kind.
     * Expected value is 'ServiceFabricVolumeDisk'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Volume size
     * 
     */
    @InputImport(name="sizeDisk", required=true)
    private final String sizeDisk;

    public String getSizeDisk() {
        return this.sizeDisk;
    }

    public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(
        @Nullable String description,
        String kind,
        String sizeDisk) {
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.sizeDisk = Objects.requireNonNull(sizeDisk, "expected parameter 'sizeDisk' to be non-null");
    }

    private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse() {
        this.description = null;
        this.kind = null;
        this.sizeDisk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String kind;
        private String sizeDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.sizeDisk = defaults.sizeDisk;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSizeDisk(String sizeDisk) {
            this.sizeDisk = Objects.requireNonNull(sizeDisk);
            return this;
        }

        public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse build() {
            return new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(description, kind, sizeDisk);
        }
    }
}
