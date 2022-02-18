// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultKeyReferenceResponseKeyVault {
    /**
     * The resource id.
     * 
     */
    private final @Nullable String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","type"})
    private KeyVaultKeyReferenceResponseKeyVault(
        @Nullable String id,
        String name,
        String type) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The resource id.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponseKeyVault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponseKeyVault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public KeyVaultKeyReferenceResponseKeyVault build() {
            return new KeyVaultKeyReferenceResponseKeyVault(id, name, type);
        }
    }
}
