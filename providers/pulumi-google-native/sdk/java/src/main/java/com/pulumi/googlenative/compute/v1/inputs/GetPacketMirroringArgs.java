// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPacketMirroringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPacketMirroringArgs Empty = new GetPacketMirroringArgs();

    @Import(name="packetMirroring", required=true)
    private Output<String> packetMirroring;

    public Output<String> packetMirroring() {
        return this.packetMirroring;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetPacketMirroringArgs() {}

    private GetPacketMirroringArgs(GetPacketMirroringArgs $) {
        this.packetMirroring = $.packetMirroring;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPacketMirroringArgs $;

        public Builder() {
            $ = new GetPacketMirroringArgs();
        }

        public Builder(GetPacketMirroringArgs defaults) {
            $ = new GetPacketMirroringArgs(Objects.requireNonNull(defaults));
        }

        public Builder packetMirroring(Output<String> packetMirroring) {
            $.packetMirroring = packetMirroring;
            return this;
        }

        public Builder packetMirroring(String packetMirroring) {
            return packetMirroring(Output.of(packetMirroring));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetPacketMirroringArgs build() {
            $.packetMirroring = Objects.requireNonNull($.packetMirroring, "expected parameter 'packetMirroring' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
