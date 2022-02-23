// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.AppResourcePropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.ManagedIdentityPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppResult {
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The Managed Identity type of the app resource
     * 
     */
    private final @Nullable ManagedIdentityPropertiesResponse identity;
    /**
     * The GEO location of the application, always the same with its parent resource
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Properties of the App resource
     * 
     */
    private final AppResourcePropertiesResponse properties;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","type"})
    private GetAppResult(
        String id,
        @Nullable ManagedIdentityPropertiesResponse identity,
        @Nullable String location,
        String name,
        AppResourcePropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The Managed Identity type of the app resource
     * 
     */
    public Optional<ManagedIdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The GEO location of the application, always the same with its parent resource
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
     * Properties of the App resource
     * 
     */
    public AppResourcePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ManagedIdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private AppResourcePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedIdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(AppResourcePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAppResult build() {
            return new GetAppResult(id, identity, location, name, properties, type);
        }
    }
}
