// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.HttpHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a HttpHealthCheck resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:HttpHealthCheck")
public class HttpHealthCheck extends io.pulumi.resources.CustomResource {
    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Export(name="checkIntervalSec", type=Integer.class, parameters={})
    private Output<Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    public Output<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Export(name="healthyThreshold", type=Integer.class, parameters={})
    private Output<Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    public Output<String> getHost() {
        return this.host;
    }
    /**
     * Type of the resource. Always compute#httpHealthCheck for HTTP health checks.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#httpHealthCheck for HTTP health checks.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    @Export(name="requestPath", type=String.class, parameters={})
    private Output<String> requestPath;

    /**
     * @return The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    public Output<String> getRequestPath() {
        return this.requestPath;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Export(name="timeoutSec", type=Integer.class, parameters={})
    private Output<Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec;
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Export(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output<Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable HttpHealthCheckArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_beta.HttpHealthCheckArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_beta.HttpHealthCheckArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HttpHealthCheck(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpHealthCheck(String name) {
        this(name, HttpHealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpHealthCheck(String name, @Nullable HttpHealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpHealthCheck(String name, @Nullable HttpHealthCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:HttpHealthCheck", name, args == null ? HttpHealthCheckArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HttpHealthCheck(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:HttpHealthCheck", name, null, makeResourceOptions(options, id));
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
    public static HttpHealthCheck get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HttpHealthCheck(name, id, options);
    }
}
