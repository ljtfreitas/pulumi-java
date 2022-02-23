// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransparentDataEncryptionResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The status of the database transparent data encryption.
     * 
     */
    private final @Nullable String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","status","type"})
    private GetTransparentDataEncryptionResult(
        String id,
        String location,
        String name,
        @Nullable String status,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.status = status;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the database transparent data encryption.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransparentDataEncryptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransparentDataEncryptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
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

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTransparentDataEncryptionResult build() {
            return new GetTransparentDataEncryptionResult(id, location, name, status, type);
        }
    }
}
