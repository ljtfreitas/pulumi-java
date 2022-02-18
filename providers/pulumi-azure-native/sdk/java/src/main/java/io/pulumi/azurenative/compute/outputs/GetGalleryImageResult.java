// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DisallowedResponse;
import io.pulumi.azurenative.compute.outputs.GalleryImageFeatureResponse;
import io.pulumi.azurenative.compute.outputs.GalleryImageIdentifierResponse;
import io.pulumi.azurenative.compute.outputs.ImagePurchasePlanResponse;
import io.pulumi.azurenative.compute.outputs.RecommendedMachineConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGalleryImageResult {
    /**
     * The description of this gallery image definition resource. This property is updatable.
     * 
     */
    private final @Nullable String description;
    /**
     * Describes the disallowed disk types.
     * 
     */
    private final @Nullable DisallowedResponse disallowed;
    /**
     * The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    private final @Nullable String endOfLifeDate;
    /**
     * The Eula agreement for the gallery image definition.
     * 
     */
    private final @Nullable String eula;
    /**
     * A list of gallery image features.
     * 
     */
    private final @Nullable List<GalleryImageFeatureResponse> features;
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    private final @Nullable String hyperVGeneration;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * This is the gallery image definition identifier.
     * 
     */
    private final GalleryImageIdentifierResponse identifier;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * This property allows the user to specify whether the virtual machines created under this image are 'Generalized' or 'Specialized'.
     * 
     */
    private final String osState;
    /**
     * This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    private final String osType;
    /**
     * The privacy statement uri.
     * 
     */
    private final @Nullable String privacyStatementUri;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Describes the gallery image definition purchase plan. This is used by marketplace images.
     * 
     */
    private final @Nullable ImagePurchasePlanResponse purchasePlan;
    /**
     * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
     * 
     */
    private final @Nullable RecommendedMachineConfigurationResponse recommended;
    /**
     * The release note uri.
     * 
     */
    private final @Nullable String releaseNoteUri;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","disallowed","endOfLifeDate","eula","features","hyperVGeneration","id","identifier","location","name","osState","osType","privacyStatementUri","provisioningState","purchasePlan","recommended","releaseNoteUri","tags","type"})
    private GetGalleryImageResult(
        @Nullable String description,
        @Nullable DisallowedResponse disallowed,
        @Nullable String endOfLifeDate,
        @Nullable String eula,
        @Nullable List<GalleryImageFeatureResponse> features,
        @Nullable String hyperVGeneration,
        String id,
        GalleryImageIdentifierResponse identifier,
        String location,
        String name,
        String osState,
        String osType,
        @Nullable String privacyStatementUri,
        String provisioningState,
        @Nullable ImagePurchasePlanResponse purchasePlan,
        @Nullable RecommendedMachineConfigurationResponse recommended,
        @Nullable String releaseNoteUri,
        @Nullable Map<String,String> tags,
        String type) {
        this.description = description;
        this.disallowed = disallowed;
        this.endOfLifeDate = endOfLifeDate;
        this.eula = eula;
        this.features = features;
        this.hyperVGeneration = hyperVGeneration;
        this.id = Objects.requireNonNull(id);
        this.identifier = Objects.requireNonNull(identifier);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.osState = Objects.requireNonNull(osState);
        this.osType = Objects.requireNonNull(osType);
        this.privacyStatementUri = privacyStatementUri;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.purchasePlan = purchasePlan;
        this.recommended = recommended;
        this.releaseNoteUri = releaseNoteUri;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The description of this gallery image definition resource. This property is updatable.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Describes the disallowed disk types.
     * 
     */
    public Optional<DisallowedResponse> getDisallowed() {
        return Optional.ofNullable(this.disallowed);
    }
    /**
     * The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    public Optional<String> getEndOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }
    /**
     * The Eula agreement for the gallery image definition.
     * 
     */
    public Optional<String> getEula() {
        return Optional.ofNullable(this.eula);
    }
    /**
     * A list of gallery image features.
     * 
     */
    public List<GalleryImageFeatureResponse> getFeatures() {
        return this.features == null ? List.of() : this.features;
    }
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    public Optional<String> getHyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * This is the gallery image definition identifier.
     * 
     */
    public GalleryImageIdentifierResponse getIdentifier() {
        return this.identifier;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * This property allows the user to specify whether the virtual machines created under this image are 'Generalized' or 'Specialized'.
     * 
     */
    public String getOsState() {
        return this.osState;
    }
    /**
     * This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    public String getOsType() {
        return this.osType;
    }
    /**
     * The privacy statement uri.
     * 
     */
    public Optional<String> getPrivacyStatementUri() {
        return Optional.ofNullable(this.privacyStatementUri);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the gallery image definition purchase plan. This is used by marketplace images.
     * 
     */
    public Optional<ImagePurchasePlanResponse> getPurchasePlan() {
        return Optional.ofNullable(this.purchasePlan);
    }
    /**
     * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
     * 
     */
    public Optional<RecommendedMachineConfigurationResponse> getRecommended() {
        return Optional.ofNullable(this.recommended);
    }
    /**
     * The release note uri.
     * 
     */
    public Optional<String> getReleaseNoteUri() {
        return Optional.ofNullable(this.releaseNoteUri);
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable DisallowedResponse disallowed;
        private @Nullable String endOfLifeDate;
        private @Nullable String eula;
        private @Nullable List<GalleryImageFeatureResponse> features;
        private @Nullable String hyperVGeneration;
        private String id;
        private GalleryImageIdentifierResponse identifier;
        private String location;
        private String name;
        private String osState;
        private String osType;
        private @Nullable String privacyStatementUri;
        private String provisioningState;
        private @Nullable ImagePurchasePlanResponse purchasePlan;
        private @Nullable RecommendedMachineConfigurationResponse recommended;
        private @Nullable String releaseNoteUri;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disallowed = defaults.disallowed;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.eula = defaults.eula;
    	      this.features = defaults.features;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.privacyStatementUri = defaults.privacyStatementUri;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purchasePlan = defaults.purchasePlan;
    	      this.recommended = defaults.recommended;
    	      this.releaseNoteUri = defaults.releaseNoteUri;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisallowed(@Nullable DisallowedResponse disallowed) {
            this.disallowed = disallowed;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setEula(@Nullable String eula) {
            this.eula = eula;
            return this;
        }

        public Builder setFeatures(@Nullable List<GalleryImageFeatureResponse> features) {
            this.features = features;
            return this;
        }

        public Builder setHyperVGeneration(@Nullable String hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentifier(GalleryImageIdentifierResponse identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsState(String osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setPrivacyStatementUri(@Nullable String privacyStatementUri) {
            this.privacyStatementUri = privacyStatementUri;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPurchasePlan(@Nullable ImagePurchasePlanResponse purchasePlan) {
            this.purchasePlan = purchasePlan;
            return this;
        }

        public Builder setRecommended(@Nullable RecommendedMachineConfigurationResponse recommended) {
            this.recommended = recommended;
            return this;
        }

        public Builder setReleaseNoteUri(@Nullable String releaseNoteUri) {
            this.releaseNoteUri = releaseNoteUri;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetGalleryImageResult build() {
            return new GetGalleryImageResult(description, disallowed, endOfLifeDate, eula, features, hyperVGeneration, id, identifier, location, name, osState, osType, privacyStatementUri, provisioningState, purchasePlan, recommended, releaseNoteUri, tags, type);
        }
    }
}
