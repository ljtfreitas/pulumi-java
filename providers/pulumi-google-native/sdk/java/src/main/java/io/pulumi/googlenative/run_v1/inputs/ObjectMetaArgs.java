// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.OwnerReferenceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 * 
 */
public final class ObjectMetaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetaArgs Empty = new ObjectMetaArgs();

    /**
     * (Optional) Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * (Optional) CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     * 
     */
    @Import(name="deletionGracePeriodSeconds")
      private final @Nullable Output<Integer> deletionGracePeriodSeconds;

    public Output<Integer> getDeletionGracePeriodSeconds() {
        return this.deletionGracePeriodSeconds == null ? Output.empty() : this.deletionGracePeriodSeconds;
    }

    /**
     * (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested. Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    @Import(name="deletionTimestamp")
      private final @Nullable Output<String> deletionTimestamp;

    public Output<String> getDeletionTimestamp() {
        return this.deletionTimestamp == null ? Output.empty() : this.deletionTimestamp;
    }

    /**
     * (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. +patchStrategy=merge
     * 
     */
    @Import(name="finalizers")
      private final @Nullable Output<List<String>> finalizers;

    public Output<List<String>> getFinalizers() {
        return this.finalizers == null ? Output.empty() : this.finalizers;
    }

    /**
     * (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server. If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header). Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency string generateName = 2;
     * 
     */
    @Import(name="generateName")
      private final @Nullable Output<String> generateName;

    public Output<String> getGenerateName() {
        return this.generateName == null ? Output.empty() : this.generateName;
    }

    /**
     * (Optional) A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<Integer> generation;

    public Output<Integer> getGeneration() {
        return this.generation == null ? Output.empty() : this.generation;
    }

    /**
     * (Optional) Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and routes. More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Name must be unique within a namespace, within a Cloud Run region. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Namespace defines the space within each name must be unique, within a Cloud Run region. In Cloud Run the namespace must be equal to either the project ID or project number.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    /**
     * (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in the list have been deleted, this object will be garbage collected.
     * 
     */
    @Import(name="ownerReferences")
      private final @Nullable Output<List<OwnerReferenceArgs>> ownerReferences;

    public Output<List<OwnerReferenceArgs>> getOwnerReferences() {
        return this.ownerReferences == null ? Output.empty() : this.ownerReferences;
    }

    /**
     * Optional. An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server or omit the value to disable conflict-detection. They may only be valid for a particular resource or set of resources. Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @Import(name="resourceVersion")
      private final @Nullable Output<String> resourceVersion;

    public Output<String> getResourceVersion() {
        return this.resourceVersion == null ? Output.empty() : this.resourceVersion;
    }

    /**
     * (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only. string selfLink = 4;
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * (Optional) UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Output.empty() : this.uid;
    }

    public ObjectMetaArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<String> clusterName,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<Integer> deletionGracePeriodSeconds,
        @Nullable Output<String> deletionTimestamp,
        @Nullable Output<List<String>> finalizers,
        @Nullable Output<String> generateName,
        @Nullable Output<Integer> generation,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> namespace,
        @Nullable Output<List<OwnerReferenceArgs>> ownerReferences,
        @Nullable Output<String> resourceVersion,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> uid) {
        this.annotations = annotations;
        this.clusterName = clusterName;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    private ObjectMetaArgs() {
        this.annotations = Output.empty();
        this.clusterName = Output.empty();
        this.creationTimestamp = Output.empty();
        this.deletionGracePeriodSeconds = Output.empty();
        this.deletionTimestamp = Output.empty();
        this.finalizers = Output.empty();
        this.generateName = Output.empty();
        this.generation = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.namespace = Output.empty();
        this.ownerReferences = Output.empty();
        this.resourceVersion = Output.empty();
        this.selfLink = Output.empty();
        this.uid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<Integer> deletionGracePeriodSeconds;
        private @Nullable Output<String> deletionTimestamp;
        private @Nullable Output<List<String>> finalizers;
        private @Nullable Output<String> generateName;
        private @Nullable Output<Integer> generation;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespace;
        private @Nullable Output<List<OwnerReferenceArgs>> ownerReferences;
        private @Nullable Output<String> resourceVersion;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterName = defaults.clusterName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deletionGracePeriodSeconds = defaults.deletionGracePeriodSeconds;
    	      this.deletionTimestamp = defaults.deletionTimestamp;
    	      this.finalizers = defaults.finalizers;
    	      this.generateName = defaults.generateName;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.ownerReferences = defaults.ownerReferences;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
            return this;
        }

        public Builder deletionGracePeriodSeconds(@Nullable Output<Integer> deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
            return this;
        }

        public Builder deletionGracePeriodSeconds(@Nullable Integer deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = Output.ofNullable(deletionGracePeriodSeconds);
            return this;
        }

        public Builder deletionTimestamp(@Nullable Output<String> deletionTimestamp) {
            this.deletionTimestamp = deletionTimestamp;
            return this;
        }

        public Builder deletionTimestamp(@Nullable String deletionTimestamp) {
            this.deletionTimestamp = Output.ofNullable(deletionTimestamp);
            return this;
        }

        public Builder finalizers(@Nullable Output<List<String>> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        public Builder finalizers(@Nullable List<String> finalizers) {
            this.finalizers = Output.ofNullable(finalizers);
            return this;
        }

        public Builder generateName(@Nullable Output<String> generateName) {
            this.generateName = generateName;
            return this;
        }

        public Builder generateName(@Nullable String generateName) {
            this.generateName = Output.ofNullable(generateName);
            return this;
        }

        public Builder generation(@Nullable Output<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder generation(@Nullable Integer generation) {
            this.generation = Output.ofNullable(generation);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }

        public Builder ownerReferences(@Nullable Output<List<OwnerReferenceArgs>> ownerReferences) {
            this.ownerReferences = ownerReferences;
            return this;
        }

        public Builder ownerReferences(@Nullable List<OwnerReferenceArgs> ownerReferences) {
            this.ownerReferences = Output.ofNullable(ownerReferences);
            return this;
        }

        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Output.ofNullable(resourceVersion);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }

        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Output.ofNullable(uid);
            return this;
        }
        public ObjectMetaArgs build() {
            return new ObjectMetaArgs(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
        }
    }
}
