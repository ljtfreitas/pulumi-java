// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecLoggingAccessLog;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecLogging {
    /**
     * The access log configuration for a virtual node.
     * 
     */
    private final @Nullable VirtualNodeSpecLoggingAccessLog accessLog;

    @OutputCustomType.Constructor({"accessLog"})
    private VirtualNodeSpecLogging(@Nullable VirtualNodeSpecLoggingAccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * The access log configuration for a virtual node.
     * 
     */
    public Optional<VirtualNodeSpecLoggingAccessLog> getAccessLog() {
        return Optional.ofNullable(this.accessLog);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecLoggingAccessLog accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder setAccessLog(@Nullable VirtualNodeSpecLoggingAccessLog accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public VirtualNodeSpecLogging build() {
            return new VirtualNodeSpecLogging(accessLog);
        }
    }
}
