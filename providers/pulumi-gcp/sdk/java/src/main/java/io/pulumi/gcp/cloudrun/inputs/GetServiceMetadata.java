// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetServiceMetadata extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceMetadata Empty = new GetServiceMetadata();

    @InputImport(name="annotations", required=true)
        private final Map<String,String> annotations;

    public Map<String,String> getAnnotations() {
        return this.annotations;
    }

    @InputImport(name="generation", required=true)
        private final Integer generation;

    public Integer getGeneration() {
        return this.generation;
    }

    @InputImport(name="labels", required=true)
        private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    @InputImport(name="namespace", required=true)
        private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    @InputImport(name="resourceVersion", required=true)
        private final String resourceVersion;

    public String getResourceVersion() {
        return this.resourceVersion;
    }

    @InputImport(name="selfLink", required=true)
        private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    @InputImport(name="uid", required=true)
        private final String uid;

    public String getUid() {
        return this.uid;
    }

    public GetServiceMetadata(
        Map<String,String> annotations,
        Integer generation,
        Map<String,String> labels,
        String namespace,
        String resourceVersion,
        String selfLink,
        String uid) {
        this.annotations = Objects.requireNonNull(annotations, "expected parameter 'annotations' to be non-null");
        this.generation = Objects.requireNonNull(generation, "expected parameter 'generation' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.resourceVersion = Objects.requireNonNull(resourceVersion, "expected parameter 'resourceVersion' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private GetServiceMetadata() {
        this.annotations = Map.of();
        this.generation = null;
        this.labels = Map.of();
        this.namespace = null;
        this.resourceVersion = null;
        this.selfLink = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private Integer generation;
        private Map<String,String> labels;
        private String namespace;
        private String resourceVersion;
        private String selfLink;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder setAnnotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setGeneration(Integer generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setResourceVersion(String resourceVersion) {
            this.resourceVersion = Objects.requireNonNull(resourceVersion);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public GetServiceMetadata build() {
            return new GetServiceMetadata(annotations, generation, labels, namespace, resourceVersion, selfLink, uid);
        }
    }
}
