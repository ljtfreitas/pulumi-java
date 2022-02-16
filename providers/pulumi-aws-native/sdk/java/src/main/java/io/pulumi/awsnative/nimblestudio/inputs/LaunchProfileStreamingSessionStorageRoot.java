// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchProfileStreamingSessionStorageRoot extends io.pulumi.resources.InvokeArgs {

    public static final LaunchProfileStreamingSessionStorageRoot Empty = new LaunchProfileStreamingSessionStorageRoot();

    @InputImport(name="linux")
    private final @Nullable String linux;

    public Optional<String> getLinux() {
        return this.linux == null ? Optional.empty() : Optional.ofNullable(this.linux);
    }

    @InputImport(name="windows")
    private final @Nullable String windows;

    public Optional<String> getWindows() {
        return this.windows == null ? Optional.empty() : Optional.ofNullable(this.windows);
    }

    public LaunchProfileStreamingSessionStorageRoot(
        @Nullable String linux,
        @Nullable String windows) {
        this.linux = linux;
        this.windows = windows;
    }

    private LaunchProfileStreamingSessionStorageRoot() {
        this.linux = null;
        this.windows = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamingSessionStorageRoot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linux;
        private @Nullable String windows;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamingSessionStorageRoot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linux = defaults.linux;
    	      this.windows = defaults.windows;
        }

        public Builder setLinux(@Nullable String linux) {
            this.linux = linux;
            return this;
        }

        public Builder setWindows(@Nullable String windows) {
            this.windows = windows;
            return this;
        }

        public LaunchProfileStreamingSessionStorageRoot build() {
            return new LaunchProfileStreamingSessionStorageRoot(linux, windows);
        }
    }
}