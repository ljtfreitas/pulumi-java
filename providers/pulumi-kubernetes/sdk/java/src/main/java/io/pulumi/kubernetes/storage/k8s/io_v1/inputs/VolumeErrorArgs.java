// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeError captures an error encountered during a volume operation.
 * 
 */
public final class VolumeErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeErrorArgs Empty = new VolumeErrorArgs();

    /**
     * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Time the error was encountered.
     * 
     */
    @Import(name="time")
      private final @Nullable Output<String> time;

    public Output<String> getTime() {
        return this.time == null ? Output.empty() : this.time;
    }

    public VolumeErrorArgs(
        @Nullable Output<String> message,
        @Nullable Output<String> time) {
        this.message = message;
        this.time = time;
    }

    private VolumeErrorArgs() {
        this.message = Output.empty();
        this.time = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> message;
        private @Nullable Output<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }

        public Builder time(@Nullable Output<String> time) {
            this.time = time;
            return this;
        }

        public Builder time(@Nullable String time) {
            this.time = Output.ofNullable(time);
            return this;
        }
        public VolumeErrorArgs build() {
            return new VolumeErrorArgs(message, time);
        }
    }
}
