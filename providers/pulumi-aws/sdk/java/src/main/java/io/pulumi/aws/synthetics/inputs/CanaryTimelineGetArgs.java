// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryTimelineGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryTimelineGetArgs Empty = new CanaryTimelineGetArgs();

    /**
     * Date and time the canary was created.
     * 
     */
    @Import(name="created")
      private final @Nullable Output<String> created;

    public Output<String> getCreated() {
        return this.created == null ? Output.empty() : this.created;
    }

    /**
     * Date and time the canary was most recently modified.
     * 
     */
    @Import(name="lastModified")
      private final @Nullable Output<String> lastModified;

    public Output<String> getLastModified() {
        return this.lastModified == null ? Output.empty() : this.lastModified;
    }

    /**
     * Date and time that the canary's most recent run started.
     * 
     */
    @Import(name="lastStarted")
      private final @Nullable Output<String> lastStarted;

    public Output<String> getLastStarted() {
        return this.lastStarted == null ? Output.empty() : this.lastStarted;
    }

    /**
     * Date and time that the canary's most recent run ended.
     * 
     */
    @Import(name="lastStopped")
      private final @Nullable Output<String> lastStopped;

    public Output<String> getLastStopped() {
        return this.lastStopped == null ? Output.empty() : this.lastStopped;
    }

    public CanaryTimelineGetArgs(
        @Nullable Output<String> created,
        @Nullable Output<String> lastModified,
        @Nullable Output<String> lastStarted,
        @Nullable Output<String> lastStopped) {
        this.created = created;
        this.lastModified = lastModified;
        this.lastStarted = lastStarted;
        this.lastStopped = lastStopped;
    }

    private CanaryTimelineGetArgs() {
        this.created = Output.empty();
        this.lastModified = Output.empty();
        this.lastStarted = Output.empty();
        this.lastStopped = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryTimelineGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> created;
        private @Nullable Output<String> lastModified;
        private @Nullable Output<String> lastStarted;
        private @Nullable Output<String> lastStopped;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryTimelineGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.lastModified = defaults.lastModified;
    	      this.lastStarted = defaults.lastStarted;
    	      this.lastStopped = defaults.lastStopped;
        }

        public Builder created(@Nullable Output<String> created) {
            this.created = created;
            return this;
        }

        public Builder created(@Nullable String created) {
            this.created = Output.ofNullable(created);
            return this;
        }

        public Builder lastModified(@Nullable Output<String> lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = Output.ofNullable(lastModified);
            return this;
        }

        public Builder lastStarted(@Nullable Output<String> lastStarted) {
            this.lastStarted = lastStarted;
            return this;
        }

        public Builder lastStarted(@Nullable String lastStarted) {
            this.lastStarted = Output.ofNullable(lastStarted);
            return this;
        }

        public Builder lastStopped(@Nullable Output<String> lastStopped) {
            this.lastStopped = lastStopped;
            return this;
        }

        public Builder lastStopped(@Nullable String lastStopped) {
            this.lastStopped = Output.ofNullable(lastStopped);
            return this;
        }
        public CanaryTimelineGetArgs build() {
            return new CanaryTimelineGetArgs(created, lastModified, lastStarted, lastStopped);
        }
    }
}
