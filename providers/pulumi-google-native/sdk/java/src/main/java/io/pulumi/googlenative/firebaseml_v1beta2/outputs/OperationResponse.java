// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class OperationResponse {
    /**
     * If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available.
     * 
     */
    private final Boolean done;
    /**
     * The error result of the operation in case of failure or cancellation.
     * 
     */
    private final StatusResponse error;
    /**
     * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such metadata. Any method that returns a long-running operation should document the metadata type, if any.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending with `operations/{unique_id}`.
     * 
     */
    private final String name;
    /**
     * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
     * 
     */
    private final Map<String,String> response;

    @OutputCustomType.Constructor({"done","error","metadata","name","response"})
    private OperationResponse(
        Boolean done,
        StatusResponse error,
        Map<String,String> metadata,
        String name,
        Map<String,String> response) {
        this.done = Objects.requireNonNull(done);
        this.error = Objects.requireNonNull(error);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.response = Objects.requireNonNull(response);
    }

    /**
     * If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available.
     * 
     */
    public Boolean getDone() {
        return this.done;
    }
    /**
     * The error result of the operation in case of failure or cancellation.
     * 
     */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such metadata. Any method that returns a long-running operation should document the metadata type, if any.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending with `operations/{unique_id}`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
     * 
     */
    public Map<String,String> getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean done;
        private StatusResponse error;
        private Map<String,String> metadata;
        private String name;
        private Map<String,String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.done = defaults.done;
    	      this.error = defaults.error;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.response = defaults.response;
        }

        public Builder setDone(Boolean done) {
            this.done = Objects.requireNonNull(done);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResponse(Map<String,String> response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }
        public OperationResponse build() {
            return new OperationResponse(done, error, metadata, name, response);
        }
    }
}
