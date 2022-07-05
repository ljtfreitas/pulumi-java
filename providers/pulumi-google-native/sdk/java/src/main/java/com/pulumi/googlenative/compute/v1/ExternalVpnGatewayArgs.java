// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.ExternalVpnGatewayRedundancyType;
import com.pulumi.googlenative.compute.v1.inputs.ExternalVpnGatewayInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalVpnGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayArgs Empty = new ExternalVpnGatewayArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers&#39; gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces;

    /**
     * @return A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers&#39; gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
     * 
     */
    public Optional<Output<List<ExternalVpnGatewayInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Indicates the user-supplied redundancy type of this external VPN gateway.
     * 
     */
    @Import(name="redundancyType")
    private @Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType;

    /**
     * @return Indicates the user-supplied redundancy type of this external VPN gateway.
     * 
     */
    public Optional<Output<ExternalVpnGatewayRedundancyType>> redundancyType() {
        return Optional.ofNullable(this.redundancyType);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private ExternalVpnGatewayArgs() {}

    private ExternalVpnGatewayArgs(ExternalVpnGatewayArgs $) {
        this.description = $.description;
        this.interfaces = $.interfaces;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.redundancyType = $.redundancyType;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalVpnGatewayArgs $;

        public Builder() {
            $ = new ExternalVpnGatewayArgs();
        }

        public Builder(ExternalVpnGatewayArgs defaults) {
            $ = new ExternalVpnGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param interfaces A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers&#39; gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers&#39; gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<ExternalVpnGatewayInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces A list of interfaces for this external VPN gateway. If your peer-side gateway is an on-premises gateway and non-AWS cloud providers&#39; gateway, at most two interfaces can be provided for an external VPN gateway. If your peer side is an AWS virtual private gateway, four interfaces should be provided for an external VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(ExternalVpnGatewayInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param redundancyType Indicates the user-supplied redundancy type of this external VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(@Nullable Output<ExternalVpnGatewayRedundancyType> redundancyType) {
            $.redundancyType = redundancyType;
            return this;
        }

        /**
         * @param redundancyType Indicates the user-supplied redundancy type of this external VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(ExternalVpnGatewayRedundancyType redundancyType) {
            return redundancyType(Output.of(redundancyType));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public ExternalVpnGatewayArgs build() {
            return $;
        }
    }

}
