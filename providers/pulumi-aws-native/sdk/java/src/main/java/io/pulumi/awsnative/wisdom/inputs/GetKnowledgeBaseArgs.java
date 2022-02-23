// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKnowledgeBaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKnowledgeBaseArgs Empty = new GetKnowledgeBaseArgs();

    @InputImport(name="knowledgeBaseId", required=true)
        private final String knowledgeBaseId;

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GetKnowledgeBaseArgs(String knowledgeBaseId) {
        this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
    }

    private GetKnowledgeBaseArgs() {
        this.knowledgeBaseId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKnowledgeBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String knowledgeBaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKnowledgeBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
        }

        public Builder setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }
        public GetKnowledgeBaseArgs build() {
            return new GetKnowledgeBaseArgs(knowledgeBaseId);
        }
    }
}
