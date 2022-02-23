// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModuleResponse {
    /**
     * Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     * 
     */
    private final @Nullable String args;
    /**
     * The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'
     * 
     */
    private final String name;
    /**
     * The version of the module, e.g. '1.0'.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"args","name","version"})
    private ModuleResponse(
        @Nullable String args,
        String name,
        String version) {
        this.args = args;
        this.name = Objects.requireNonNull(name);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     * 
     */
    public Optional<String> getArgs() {
        return Optional.ofNullable(this.args);
    }
    /**
     * The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The version of the module, e.g. '1.0'.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String args;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setArgs(@Nullable String args) {
            this.args = args;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ModuleResponse build() {
            return new ModuleResponse(args, name, version);
        }
    }
}
