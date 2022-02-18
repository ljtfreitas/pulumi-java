// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.PartnerContentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationAccountPartnerResult {
    /**
     * The changed time.
     * 
     */
    private final String changedTime;
    /**
     * The partner content.
     * 
     */
    private final PartnerContentResponse content;
    /**
     * The created time.
     * 
     */
    private final String createdTime;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The metadata.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The partner type.
     * 
     */
    private final String partnerType;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"changedTime","content","createdTime","id","location","metadata","name","partnerType","tags","type"})
    private GetIntegrationAccountPartnerResult(
        String changedTime,
        PartnerContentResponse content,
        String createdTime,
        String id,
        @Nullable String location,
        @Nullable Object metadata,
        String name,
        String partnerType,
        @Nullable Map<String,String> tags,
        String type) {
        this.changedTime = Objects.requireNonNull(changedTime);
        this.content = Objects.requireNonNull(content);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.partnerType = Objects.requireNonNull(partnerType);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The changed time.
     * 
     */
    public String getChangedTime() {
        return this.changedTime;
    }
    /**
     * The partner content.
     * 
     */
    public PartnerContentResponse getContent() {
        return this.content;
    }
    /**
     * The created time.
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The resource id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The metadata.
     * 
     */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Gets the resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The partner type.
     * 
     */
    public String getPartnerType() {
        return this.partnerType;
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountPartnerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changedTime;
        private PartnerContentResponse content;
        private String createdTime;
        private String id;
        private @Nullable String location;
        private @Nullable Object metadata;
        private String name;
        private String partnerType;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountPartnerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.partnerType = defaults.partnerType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setChangedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder setContent(PartnerContentResponse content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerType(String partnerType) {
            this.partnerType = Objects.requireNonNull(partnerType);
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

        public GetIntegrationAccountPartnerResult build() {
            return new GetIntegrationAccountPartnerResult(changedTime, content, createdTime, id, location, metadata, name, partnerType, tags, type);
        }
    }
}
