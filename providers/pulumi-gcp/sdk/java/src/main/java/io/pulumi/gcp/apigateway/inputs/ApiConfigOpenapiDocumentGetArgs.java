// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentGetArgs;
import java.util.Objects;


public final class ApiConfigOpenapiDocumentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigOpenapiDocumentGetArgs Empty = new ApiConfigOpenapiDocumentGetArgs();

    /**
     * The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="document", required=true)
        private final Input<ApiConfigOpenapiDocumentDocumentGetArgs> document;

    public Input<ApiConfigOpenapiDocumentDocumentGetArgs> getDocument() {
        return this.document;
    }

    public ApiConfigOpenapiDocumentGetArgs(Input<ApiConfigOpenapiDocumentDocumentGetArgs> document) {
        this.document = Objects.requireNonNull(document, "expected parameter 'document' to be non-null");
    }

    private ApiConfigOpenapiDocumentGetArgs() {
        this.document = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigOpenapiDocumentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApiConfigOpenapiDocumentDocumentGetArgs> document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigOpenapiDocumentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder setDocument(Input<ApiConfigOpenapiDocumentDocumentGetArgs> document) {
            this.document = Objects.requireNonNull(document);
            return this;
        }

        public Builder setDocument(ApiConfigOpenapiDocumentDocumentGetArgs document) {
            this.document = Input.of(Objects.requireNonNull(document));
            return this;
        }
        public ApiConfigOpenapiDocumentGetArgs build() {
            return new ApiConfigOpenapiDocumentGetArgs(document);
        }
    }
}
