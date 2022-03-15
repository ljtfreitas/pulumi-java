// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.ConfigMapVolumeSourceArgs;
import io.pulumi.googlenative.run_v1.inputs.SecretVolumeSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    @Import(name="configMap")
      private final @Nullable Output<ConfigMapVolumeSourceArgs> configMap;

    public Output<ConfigMapVolumeSourceArgs> getConfigMap() {
        return this.configMap == null ? Output.empty() : this.configMap;
    }

    /**
     * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="secret")
      private final @Nullable Output<SecretVolumeSourceArgs> secret;

    public Output<SecretVolumeSourceArgs> getSecret() {
        return this.secret == null ? Output.empty() : this.secret;
    }

    public VolumeArgs(
        @Nullable Output<ConfigMapVolumeSourceArgs> configMap,
        @Nullable Output<String> name,
        @Nullable Output<SecretVolumeSourceArgs> secret) {
        this.configMap = configMap;
        this.name = name;
        this.secret = secret;
    }

    private VolumeArgs() {
        this.configMap = Output.empty();
        this.name = Output.empty();
        this.secret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigMapVolumeSourceArgs> configMap;
        private @Nullable Output<String> name;
        private @Nullable Output<SecretVolumeSourceArgs> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder configMap(@Nullable Output<ConfigMapVolumeSourceArgs> configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder configMap(@Nullable ConfigMapVolumeSourceArgs configMap) {
            this.configMap = Output.ofNullable(configMap);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder secret(@Nullable Output<SecretVolumeSourceArgs> secret) {
            this.secret = secret;
            return this;
        }

        public Builder secret(@Nullable SecretVolumeSourceArgs secret) {
            this.secret = Output.ofNullable(secret);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(configMap, name, secret);
        }
    }
}
