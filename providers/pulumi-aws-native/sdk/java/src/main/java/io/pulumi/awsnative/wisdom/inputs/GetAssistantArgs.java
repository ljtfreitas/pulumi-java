// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssistantArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssistantArgs Empty = new GetAssistantArgs();

    @Import(name="assistantId", required=true)
      private final String assistantId;

    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAssistantArgs(String assistantId) {
        this.assistantId = Objects.requireNonNull(assistantId, "expected parameter 'assistantId' to be non-null");
    }

    private GetAssistantArgs() {
        this.assistantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssistantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assistantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssistantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assistantId = defaults.assistantId;
        }

        public Builder assistantId(String assistantId) {
            this.assistantId = Objects.requireNonNull(assistantId);
            return this;
        }
        public GetAssistantArgs build() {
            return new GetAssistantArgs(assistantId);
        }
    }
}
