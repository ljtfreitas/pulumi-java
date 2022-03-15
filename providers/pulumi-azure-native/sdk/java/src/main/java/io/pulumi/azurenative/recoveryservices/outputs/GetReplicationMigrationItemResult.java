// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.MigrationItemPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReplicationMigrationItemResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource Location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource Name
     * 
     */
    private final String name;
    /**
     * The migration item properties.
     * 
     */
    private final MigrationItemPropertiesResponse properties;
    /**
     * Resource Type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetReplicationMigrationItemResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") MigrationItemPropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource Location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource Name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The migration item properties.
     * 
    */
    public MigrationItemPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationMigrationItemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private MigrationItemPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationMigrationItemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder properties(MigrationItemPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetReplicationMigrationItemResult build() {
            return new GetReplicationMigrationItemResult(id, location, name, properties, type);
        }
    }
}
