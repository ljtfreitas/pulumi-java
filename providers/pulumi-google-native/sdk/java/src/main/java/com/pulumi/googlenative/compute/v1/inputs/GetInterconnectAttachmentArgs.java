// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterconnectAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInterconnectAttachmentArgs Empty = new GetInterconnectAttachmentArgs();

    @Import(name="interconnectAttachment", required=true)
    private Output<String> interconnectAttachment;

    public Output<String> interconnectAttachment() {
        return this.interconnectAttachment;
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

    private GetInterconnectAttachmentArgs() {}

    private GetInterconnectAttachmentArgs(GetInterconnectAttachmentArgs $) {
        this.interconnectAttachment = $.interconnectAttachment;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInterconnectAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInterconnectAttachmentArgs $;

        public Builder() {
            $ = new GetInterconnectAttachmentArgs();
        }

        public Builder(GetInterconnectAttachmentArgs defaults) {
            $ = new GetInterconnectAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder interconnectAttachment(Output<String> interconnectAttachment) {
            $.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder interconnectAttachment(String interconnectAttachment) {
            return interconnectAttachment(Output.of(interconnectAttachment));
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

        public GetInterconnectAttachmentArgs build() {
            $.interconnectAttachment = Objects.requireNonNull($.interconnectAttachment, "expected parameter 'interconnectAttachment' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
