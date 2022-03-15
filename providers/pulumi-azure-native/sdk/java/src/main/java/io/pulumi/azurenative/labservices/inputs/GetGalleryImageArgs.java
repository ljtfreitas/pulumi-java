// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGalleryImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGalleryImageArgs Empty = new GetGalleryImageArgs();

    /**
     * Specify the $expand query. Example: 'properties($select=author)'
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the gallery Image.
     * 
     */
    @Import(name="galleryImageName", required=true)
      private final String galleryImageName;

    public String getGalleryImageName() {
        return this.galleryImageName;
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
      private final String labAccountName;

    public String getLabAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGalleryImageArgs(
        @Nullable String expand,
        String galleryImageName,
        String labAccountName,
        String resourceGroupName) {
        this.expand = expand;
        this.galleryImageName = Objects.requireNonNull(galleryImageName, "expected parameter 'galleryImageName' to be non-null");
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGalleryImageArgs() {
        this.expand = null;
        this.galleryImageName = null;
        this.labAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String galleryImageName;
        private String labAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.galleryImageName = defaults.galleryImageName;
    	      this.labAccountName = defaults.labAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder galleryImageName(String galleryImageName) {
            this.galleryImageName = Objects.requireNonNull(galleryImageName);
            return this;
        }

        public Builder labAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetGalleryImageArgs build() {
            return new GetGalleryImageArgs(expand, galleryImageName, labAccountName, resourceGroupName);
        }
    }
}
