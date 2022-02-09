// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetArchiveDeploymentResult {
    private final String createdAt;
    private final String gcsUri;
    private final Map<String,String> labels;
    private final String name;
    private final String operation;
    private final String updatedAt;

    @OutputCustomType.Constructor({"createdAt","gcsUri","labels","name","operation","updatedAt"})
    private GetArchiveDeploymentResult(
        String createdAt,
        String gcsUri,
        Map<String,String> labels,
        String name,
        String operation,
        String updatedAt) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.gcsUri = Objects.requireNonNull(gcsUri);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.operation = Objects.requireNonNull(operation);
        this.updatedAt = Objects.requireNonNull(updatedAt);
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public String getGcsUri() {
        return this.gcsUri;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public String getOperation() {
        return this.operation;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArchiveDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String gcsUri;
        private Map<String,String> labels;
        private String name;
        private String operation;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArchiveDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.gcsUri = defaults.gcsUri;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setGcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }

        public GetArchiveDeploymentResult build() {
            return new GetArchiveDeploymentResult(createdAt, gcsUri, labels, name, operation, updatedAt);
        }
    }
}