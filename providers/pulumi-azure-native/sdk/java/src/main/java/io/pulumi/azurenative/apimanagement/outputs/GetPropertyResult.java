// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyResult {
    /**
     * Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    private final String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    private final @Nullable Boolean secret;
    /**
     * Optional tags that when provided can be used to filter the property list.
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetPropertyResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secret") @Nullable Boolean secret,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.secret = secret;
        this.tags = tags;
        this.type = type;
        this.value = value;
    }

    /**
     * Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
    */
    public Optional<Boolean> getSecret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * Optional tags that when provided can be used to filter the property list.
     * 
    */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String name;
        private @Nullable Boolean secret;
        private @Nullable List<String> tags;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPropertyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder secret(@Nullable Boolean secret) {
            this.secret = secret;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetPropertyResult build() {
            return new GetPropertyResult(displayName, id, name, secret, tags, type, value);
        }
    }
}
