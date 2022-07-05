// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration.v1.inputs.VmwareSourceDetailsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * User-provided description of the source.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided description of the source.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The labels of the source.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels of the source.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Required. The source identifier.
     * 
     */
    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    /**
     * @return Required. The source identifier.
     * 
     */
    public Output<String> sourceId() {
        return this.sourceId;
    }

    /**
     * Vmware type source details.
     * 
     */
    @Import(name="vmware")
    private @Nullable Output<VmwareSourceDetailsArgs> vmware;

    /**
     * @return Vmware type source details.
     * 
     */
    public Optional<Output<VmwareSourceDetailsArgs>> vmware() {
        return Optional.ofNullable(this.vmware);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.requestId = $.requestId;
        this.sourceId = $.sourceId;
        this.vmware = $.vmware;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User-provided description of the source.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided description of the source.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels The labels of the source.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels of the source.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param sourceId Required. The source identifier.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId Required. The source identifier.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param vmware Vmware type source details.
         * 
         * @return builder
         * 
         */
        public Builder vmware(@Nullable Output<VmwareSourceDetailsArgs> vmware) {
            $.vmware = vmware;
            return this;
        }

        /**
         * @param vmware Vmware type source details.
         * 
         * @return builder
         * 
         */
        public Builder vmware(VmwareSourceDetailsArgs vmware) {
            return vmware(Output.of(vmware));
        }

        public SourceArgs build() {
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
