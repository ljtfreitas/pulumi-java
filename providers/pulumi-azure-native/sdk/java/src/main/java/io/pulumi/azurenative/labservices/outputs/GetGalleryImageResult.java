// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.GalleryImageReferenceResponse;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGalleryImageResult {
    /**
     * The author of the gallery image.
     * 
     */
    private final String author;
    /**
     * The creation date of the gallery image.
     * 
     */
    private final String createdDate;
    /**
     * The description of the gallery image.
     * 
     */
    private final String description;
    /**
     * The icon of the gallery image.
     * 
     */
    private final String icon;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The image reference of the gallery image.
     * 
     */
    private final GalleryImageReferenceResponse imageReference;
    /**
     * Indicates whether this gallery image is enabled.
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * Indicates whether this gallery has been overridden for this lab account
     * 
     */
    private final @Nullable Boolean isOverride;
    /**
     * Indicates if the plan has been authorized for programmatic deployment.
     * 
     */
    private final @Nullable Boolean isPlanAuthorized;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The third party plan that applies to this image
     * 
     */
    private final String planId;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @CustomType.Constructor
    private GetGalleryImageResult(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("icon") String icon,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageReference") GalleryImageReferenceResponse imageReference,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("isOverride") @Nullable Boolean isOverride,
        @CustomType.Parameter("isPlanAuthorized") @Nullable Boolean isPlanAuthorized,
        @CustomType.Parameter("latestOperationResult") LatestOperationResultResponse latestOperationResult,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("planId") String planId,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") @Nullable String uniqueIdentifier) {
        this.author = author;
        this.createdDate = createdDate;
        this.description = description;
        this.icon = icon;
        this.id = id;
        this.imageReference = imageReference;
        this.isEnabled = isEnabled;
        this.isOverride = isOverride;
        this.isPlanAuthorized = isPlanAuthorized;
        this.latestOperationResult = latestOperationResult;
        this.location = location;
        this.name = name;
        this.planId = planId;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The author of the gallery image.
     * 
    */
    public String getAuthor() {
        return this.author;
    }
    /**
     * The creation date of the gallery image.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The description of the gallery image.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The icon of the gallery image.
     * 
    */
    public String getIcon() {
        return this.icon;
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The image reference of the gallery image.
     * 
    */
    public GalleryImageReferenceResponse getImageReference() {
        return this.imageReference;
    }
    /**
     * Indicates whether this gallery image is enabled.
     * 
    */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * Indicates whether this gallery has been overridden for this lab account
     * 
    */
    public Optional<Boolean> getIsOverride() {
        return Optional.ofNullable(this.isOverride);
    }
    /**
     * Indicates if the plan has been authorized for programmatic deployment.
     * 
    */
    public Optional<Boolean> getIsPlanAuthorized() {
        return Optional.ofNullable(this.isPlanAuthorized);
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
    */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The third party plan that applies to this image
     * 
    */
    public String getPlanId() {
        return this.planId;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private String createdDate;
        private String description;
        private String icon;
        private String id;
        private GalleryImageReferenceResponse imageReference;
        private @Nullable Boolean isEnabled;
        private @Nullable Boolean isOverride;
        private @Nullable Boolean isPlanAuthorized;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private String planId;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.icon = defaults.icon;
    	      this.id = defaults.id;
    	      this.imageReference = defaults.imageReference;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isOverride = defaults.isOverride;
    	      this.isPlanAuthorized = defaults.isPlanAuthorized;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.planId = defaults.planId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder icon(String icon) {
            this.icon = Objects.requireNonNull(icon);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder imageReference(GalleryImageReferenceResponse imageReference) {
            this.imageReference = Objects.requireNonNull(imageReference);
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isOverride(@Nullable Boolean isOverride) {
            this.isOverride = isOverride;
            return this;
        }

        public Builder isPlanAuthorized(@Nullable Boolean isPlanAuthorized) {
            this.isPlanAuthorized = isPlanAuthorized;
            return this;
        }

        public Builder latestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }
        public GetGalleryImageResult build() {
            return new GetGalleryImageResult(author, createdDate, description, icon, id, imageReference, isEnabled, isOverride, isPlanAuthorized, latestOperationResult, location, name, planId, provisioningState, tags, type, uniqueIdentifier);
        }
    }
}
