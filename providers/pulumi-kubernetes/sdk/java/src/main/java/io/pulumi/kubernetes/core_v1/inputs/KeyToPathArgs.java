// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maps a string key to a path within a volume.
 * 
 */
public final class KeyToPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyToPathArgs Empty = new KeyToPathArgs();

    /**
     * The key to project.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Integer> mode;

    public Output<Integer> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public KeyToPathArgs(
        Output<String> key,
        @Nullable Output<Integer> mode,
        Output<String> path) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.mode = mode;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private KeyToPathArgs() {
        this.key = Output.empty();
        this.mode = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<Integer> mode;
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder mode(@Nullable Output<Integer> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable Integer mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public KeyToPathArgs build() {
            return new KeyToPathArgs(key, mode, path);
        }
    }
}
