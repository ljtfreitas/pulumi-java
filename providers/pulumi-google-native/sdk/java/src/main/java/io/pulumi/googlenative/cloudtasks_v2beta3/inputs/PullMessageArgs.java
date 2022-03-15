// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pull Message. This proto can only be used for tasks in a queue which has PULL type. It currently exists for backwards compatibility with the App Engine Task Queue SDK. This message type maybe returned with methods list and get, when the response view is FULL.
 * 
 */
public final class PullMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PullMessageArgs Empty = new PullMessageArgs();

    /**
     * A data payload consumed by the worker to execute the task.
     * 
     */
    @Import(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * The tasks's tag. The tag is less than 500 characters. SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8 encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    public PullMessageArgs(
        @Nullable Output<String> payload,
        @Nullable Output<String> tag) {
        this.payload = payload;
        this.tag = tag;
    }

    private PullMessageArgs() {
        this.payload = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payload;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(PullMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.tag = defaults.tag;
        }

        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable String payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }

        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }
        public PullMessageArgs build() {
            return new PullMessageArgs(payload, tag);
        }
    }
}
