// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGalleryApplicationResult {
    /**
     * The description of this gallery Application Definition resource. This property is updatable.
     * 
     */
    private final @Nullable String description;
    /**
     * The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    private final @Nullable String endOfLifeDate;
    /**
     * The Eula agreement for the gallery Application Definition.
     * 
     */
    private final @Nullable String eula;
    /**
     * Resource Id
     * 
     */
    private final String id;
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
     * The privacy statement uri.
     * 
     */
    private final @Nullable String privacyStatementUri;
    /**
     * The release note uri.
     * 
     */
    private final @Nullable String releaseNoteUri;
    /**
     * This property allows you to specify the supported type of the OS that application is built for. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    private final String supportedOSType;
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

    @OutputCustomType.Constructor({"description","endOfLifeDate","eula","id","location","name","privacyStatementUri","releaseNoteUri","supportedOSType","tags","type"})
    private GetGalleryApplicationResult(
        @Nullable String description,
        @Nullable String endOfLifeDate,
        @Nullable String eula,
        String id,
        String location,
        String name,
        @Nullable String privacyStatementUri,
        @Nullable String releaseNoteUri,
        String supportedOSType,
        @Nullable Map<String,String> tags,
        String type) {
        this.description = description;
        this.endOfLifeDate = endOfLifeDate;
        this.eula = eula;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.privacyStatementUri = privacyStatementUri;
        this.releaseNoteUri = releaseNoteUri;
        this.supportedOSType = Objects.requireNonNull(supportedOSType);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The description of this gallery Application Definition resource. This property is updatable.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    public Optional<String> getEndOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }
    /**
     * The Eula agreement for the gallery Application Definition.
     * 
     */
    public Optional<String> getEula() {
        return Optional.ofNullable(this.eula);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
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
     * The privacy statement uri.
     * 
     */
    public Optional<String> getPrivacyStatementUri() {
        return Optional.ofNullable(this.privacyStatementUri);
    }
    /**
     * The release note uri.
     * 
     */
    public Optional<String> getReleaseNoteUri() {
        return Optional.ofNullable(this.releaseNoteUri);
    }
    /**
     * This property allows you to specify the supported type of the OS that application is built for. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    public String getSupportedOSType() {
        return this.supportedOSType;
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

    public static Builder builder(GetGalleryApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String endOfLifeDate;
        private @Nullable String eula;
        private String id;
        private String location;
        private String name;
        private @Nullable String privacyStatementUri;
        private @Nullable String releaseNoteUri;
        private String supportedOSType;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.eula = defaults.eula;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privacyStatementUri = defaults.privacyStatementUri;
    	      this.releaseNoteUri = defaults.releaseNoteUri;
    	      this.supportedOSType = defaults.supportedOSType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
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

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setPrivacyStatementUri(@Nullable String privacyStatementUri) {
            this.privacyStatementUri = privacyStatementUri;
            return this;
        }

        public Builder setReleaseNoteUri(@Nullable String releaseNoteUri) {
            this.releaseNoteUri = releaseNoteUri;
            return this;
        }

        public Builder setSupportedOSType(String supportedOSType) {
            this.supportedOSType = Objects.requireNonNull(supportedOSType);
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
        public GetGalleryApplicationResult build() {
            return new GetGalleryApplicationResult(description, endOfLifeDate, eula, id, location, name, privacyStatementUri, releaseNoteUri, supportedOSType, tags, type);
        }
    }
}
