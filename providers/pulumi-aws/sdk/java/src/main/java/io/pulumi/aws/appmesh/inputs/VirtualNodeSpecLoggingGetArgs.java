// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecLoggingGetArgs Empty = new VirtualNodeSpecLoggingGetArgs();

    /**
     * The access log configuration for a virtual node.
     * 
     */
    @InputImport(name="accessLog")
    private final @Nullable Input<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog;

    public Input<VirtualNodeSpecLoggingAccessLogGetArgs> getAccessLog() {
        return this.accessLog == null ? Input.empty() : this.accessLog;
    }

    public VirtualNodeSpecLoggingGetArgs(@Nullable Input<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualNodeSpecLoggingGetArgs() {
        this.accessLog = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder setAccessLog(@Nullable Input<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }

        public Builder setAccessLog(@Nullable VirtualNodeSpecLoggingAccessLogGetArgs accessLog) {
            this.accessLog = Input.ofNullable(accessLog);
            return this;
        }
        public VirtualNodeSpecLoggingGetArgs build() {
            return new VirtualNodeSpecLoggingGetArgs(accessLog);
        }
    }
}
