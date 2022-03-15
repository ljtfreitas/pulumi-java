// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.VolumeAttachmentSourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSpecArgs Empty = new VolumeAttachmentSpecArgs();

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    @Import(name="attacher", required=true)
      private final Output<String> attacher;

    public Output<String> getAttacher() {
        return this.attacher;
    }

    /**
     * The node that the volume should be attached to.
     * 
     */
    @Import(name="nodeName", required=true)
      private final Output<String> nodeName;

    public Output<String> getNodeName() {
        return this.nodeName;
    }

    /**
     * Source represents the volume that should be attached.
     * 
     */
    @Import(name="source", required=true)
      private final Output<VolumeAttachmentSourceArgs> source;

    public Output<VolumeAttachmentSourceArgs> getSource() {
        return this.source;
    }

    public VolumeAttachmentSpecArgs(
        Output<String> attacher,
        Output<String> nodeName,
        Output<VolumeAttachmentSourceArgs> source) {
        this.attacher = Objects.requireNonNull(attacher, "expected parameter 'attacher' to be non-null");
        this.nodeName = Objects.requireNonNull(nodeName, "expected parameter 'nodeName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private VolumeAttachmentSpecArgs() {
        this.attacher = Output.empty();
        this.nodeName = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attacher;
        private Output<String> nodeName;
        private Output<VolumeAttachmentSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        public Builder attacher(Output<String> attacher) {
            this.attacher = Objects.requireNonNull(attacher);
            return this;
        }

        public Builder attacher(String attacher) {
            this.attacher = Output.of(Objects.requireNonNull(attacher));
            return this;
        }

        public Builder nodeName(Output<String> nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder nodeName(String nodeName) {
            this.nodeName = Output.of(Objects.requireNonNull(nodeName));
            return this;
        }

        public Builder source(Output<VolumeAttachmentSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(VolumeAttachmentSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public VolumeAttachmentSpecArgs build() {
            return new VolumeAttachmentSpecArgs(attacher, nodeName, source);
        }
    }
}
