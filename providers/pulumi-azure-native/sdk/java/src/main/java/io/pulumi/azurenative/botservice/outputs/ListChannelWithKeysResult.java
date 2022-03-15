// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.AlexaChannelResponse;
import io.pulumi.azurenative.botservice.outputs.ChannelSettingsResponse;
import io.pulumi.azurenative.botservice.outputs.DirectLineChannelResponse;
import io.pulumi.azurenative.botservice.outputs.DirectLineSpeechChannelResponse;
import io.pulumi.azurenative.botservice.outputs.EmailChannelResponse;
import io.pulumi.azurenative.botservice.outputs.FacebookChannelResponse;
import io.pulumi.azurenative.botservice.outputs.KikChannelResponse;
import io.pulumi.azurenative.botservice.outputs.LineChannelResponse;
import io.pulumi.azurenative.botservice.outputs.MsTeamsChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SkuResponse;
import io.pulumi.azurenative.botservice.outputs.SkypeChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SlackChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SmsChannelResponse;
import io.pulumi.azurenative.botservice.outputs.TelegramChannelResponse;
import io.pulumi.azurenative.botservice.outputs.WebChatChannelResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListChannelWithKeysResult {
    /**
     * Changed time of the resource
     * 
     */
    private final @Nullable String changedTime;
    /**
     * Entity tag of the resource
     * 
     */
    private final @Nullable String entityTag;
    /**
     * Entity Tag
     * 
     */
    private final @Nullable String etag;
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * The set of properties specific to bot channel resource
     * 
     */
    private final Object properties;
    /**
     * Provisioning state of the resource
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The set of properties specific to bot channel resource
     * 
     */
    private final @Nullable Object resource;
    /**
     * Channel settings
     * 
     */
    private final @Nullable ChannelSettingsResponse setting;
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;
    /**
     * Entity zones
     * 
     */
    private final List<String> zones;

    @CustomType.Constructor
    private ListChannelWithKeysResult(
        @CustomType.Parameter("changedTime") @Nullable String changedTime,
        @CustomType.Parameter("entityTag") @Nullable String entityTag,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Object properties,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("resource") @Nullable Object resource,
        @CustomType.Parameter("setting") @Nullable ChannelSettingsResponse setting,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") List<String> zones) {
        this.changedTime = changedTime;
        this.entityTag = entityTag;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.provisioningState = provisioningState;
        this.resource = resource;
        this.setting = setting;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * Changed time of the resource
     * 
    */
    public Optional<String> getChangedTime() {
        return Optional.ofNullable(this.changedTime);
    }
    /**
     * Entity tag of the resource
     * 
    */
    public Optional<String> getEntityTag() {
        return Optional.ofNullable(this.entityTag);
    }
    /**
     * Entity Tag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Specifies the resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The set of properties specific to bot channel resource
     * 
    */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The set of properties specific to bot channel resource
     * 
    */
    public Optional<Object> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Channel settings
     * 
    */
    public Optional<ChannelSettingsResponse> getSetting() {
        return Optional.ofNullable(this.setting);
    }
    /**
     * Gets or sets the SKU of the resource.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Entity zones
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListChannelWithKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String changedTime;
        private @Nullable String entityTag;
        private @Nullable String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private Object properties;
        private @Nullable String provisioningState;
        private @Nullable Object resource;
        private @Nullable ChannelSettingsResponse setting;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(ListChannelWithKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.entityTag = defaults.entityTag;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resource = defaults.resource;
    	      this.setting = defaults.setting;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder entityTag(@Nullable String entityTag) {
            this.entityTag = entityTag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
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

        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder resource(@Nullable Object resource) {
            this.resource = resource;
            return this;
        }

        public Builder setting(@Nullable ChannelSettingsResponse setting) {
            this.setting = setting;
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
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

        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public ListChannelWithKeysResult build() {
            return new ListChannelWithKeysResult(changedTime, entityTag, etag, id, kind, location, name, properties, provisioningState, resource, setting, sku, tags, type, zones);
        }
    }
}
