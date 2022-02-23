// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssistantAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssistantAssociationArgs Empty = new GetAssistantAssociationArgs();

    @InputImport(name="assistantAssociationId", required=true)
        private final String assistantAssociationId;

    public String getAssistantAssociationId() {
        return this.assistantAssociationId;
    }

    @InputImport(name="assistantId", required=true)
        private final String assistantId;

    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAssistantAssociationArgs(
        String assistantAssociationId,
        String assistantId) {
        this.assistantAssociationId = Objects.requireNonNull(assistantAssociationId, "expected parameter 'assistantAssociationId' to be non-null");
        this.assistantId = Objects.requireNonNull(assistantId, "expected parameter 'assistantId' to be non-null");
    }

    private GetAssistantAssociationArgs() {
        this.assistantAssociationId = null;
        this.assistantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssistantAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assistantAssociationId;
        private String assistantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssistantAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assistantAssociationId = defaults.assistantAssociationId;
    	      this.assistantId = defaults.assistantId;
        }

        public Builder setAssistantAssociationId(String assistantAssociationId) {
            this.assistantAssociationId = Objects.requireNonNull(assistantAssociationId);
            return this;
        }

        public Builder setAssistantId(String assistantId) {
            this.assistantId = Objects.requireNonNull(assistantId);
            return this;
        }
        public GetAssistantAssociationArgs build() {
            return new GetAssistantAssociationArgs(assistantAssociationId, assistantId);
        }
    }
}
