// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies configuration of a redis module
 * 
 */
public final class ModuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModuleResponse Empty = new ModuleResponse();

    /**
     * Configuration options for the module, e.g. 'ERROR_RATE 0.00 INITIAL_SIZE 400'.
     * 
     */
    @InputImport(name="args")
        private final @Nullable String args;

    public Optional<String> getArgs() {
        return this.args == null ? Optional.empty() : Optional.ofNullable(this.args);
    }

    /**
     * The name of the module, e.g. 'RedisBloom', 'RediSearch', 'RedisTimeSeries'
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The version of the module, e.g. '1.0'.
     * 
     */
    @InputImport(name="version", required=true)
        private final String version;

    public String getVersion() {
        return this.version;
    }

    public ModuleResponse(
        @Nullable String args,
        String name,
        String version) {
        this.args = args;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ModuleResponse() {
        this.args = null;
        this.name = null;
        this.version = null;
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
