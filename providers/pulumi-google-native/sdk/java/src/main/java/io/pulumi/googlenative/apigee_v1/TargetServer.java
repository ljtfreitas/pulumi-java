// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.TargetServerArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1TlsInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a TargetServer in the specified environment.
 * 
 */
@ResourceType(type="google-native:apigee/v1:TargetServer")
public class TargetServer extends io.pulumi.resources.CustomResource {
    /**
     * Optional. A human-readable description of this TargetServer.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A human-readable description of this TargetServer.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    public Output<String> getHost() {
        return this.host;
    }
    /**
     * Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The resource id of this target server. Values must match the regular expression
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of this target server. Values must match the regular expression
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * Immutable. The protocol used by this TargetServer.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Immutable. The protocol used by this TargetServer.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    @Export(name="sSLInfo", type=GoogleCloudApigeeV1TlsInfoResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1TlsInfoResponse> sSLInfo;

    /**
     * @return Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    public Output<GoogleCloudApigeeV1TlsInfoResponse> getSSLInfo() {
        return this.sSLInfo;
    }

    public interface BuilderApplicator {
        public void apply(TargetServerArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.TargetServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.TargetServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TargetServer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetServer(String name) {
        this(name, TargetServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetServer(String name, TargetServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetServer(String name, TargetServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:TargetServer", name, args == null ? TargetServerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TargetServer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:TargetServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TargetServer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TargetServer(name, id, options);
    }
}
