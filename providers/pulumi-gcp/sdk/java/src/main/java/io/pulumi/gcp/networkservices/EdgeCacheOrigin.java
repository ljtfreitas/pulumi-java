// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.networkservices.EdgeCacheOriginArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheOriginState;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheOriginTimeout;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * EdgeCacheOrigin represents a HTTP-reachable backend for an EdgeCacheService.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EdgeCacheOrigin can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin default projects/{{project}}/locations/global/edgeCacheOrigins/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin")
public class EdgeCacheOrigin extends io.pulumi.resources.CustomResource {
    /**
     * A human-readable description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The Origin resource to try when the current origin cannot be reached.
     * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
     * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
     * A reference to a Topic resource.
     * 
     */
    @Export(name="failoverOrigin", type=String.class, parameters={})
    private Output</* @Nullable */ String> failoverOrigin;

    /**
     * @return The Origin resource to try when the current origin cannot be reached.
     * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
     * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
     * A reference to a Topic resource.
     * 
     */
    public Output</* @Nullable */ String> failoverOrigin() {
        return this.failoverOrigin;
    }
    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
     * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
     * retryConditions and failoverOrigin to control its own cache fill failures.
     * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
     * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
     * The last valid response from an origin will be returned to the client.
     * If no origin returns a valid response, an HTTP 503 will be returned to the client.
     * Defaults to 1. Must be a value greater than 0 and less than 4.
     * 
     */
    @Export(name="maxAttempts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxAttempts;

    /**
     * @return The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
     * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
     * retryConditions and failoverOrigin to control its own cache fill failures.
     * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
     * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
     * The last valid response from an origin will be returned to the client.
     * If no origin returns a valid response, an HTTP 503 will be returned to the client.
     * Defaults to 1. Must be a value greater than 0 and less than 4.
     * 
     */
    public Output</* @Nullable */ Integer> maxAttempts() {
        return this.maxAttempts;
    }
    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
     * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
     * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
     * If a Cloud Storage bucket is provided, it must be in the canonical "gs://bucketname" format. Other forms, such as "storage.googleapis.com", will be rejected.
     * 
     */
    @Export(name="originAddress", type=String.class, parameters={})
    private Output<String> originAddress;

    /**
     * @return A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
     * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
     * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
     * If a Cloud Storage bucket is provided, it must be in the canonical "gs://bucketname" format. Other forms, such as "storage.googleapis.com", will be rejected.
     * 
     */
    public Output<String> originAddress() {
        return this.originAddress;
    }
    /**
     * The port to connect to the origin on.
     * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port to connect to the origin on.
     * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security & performance.
     * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
     * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security & performance.
     * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
     * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Specifies one or more retry conditions for the configured origin.
     * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
     * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
     * The default retryCondition is "CONNECT_FAILURE".
     * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
     * which may specify their own retryConditions and maxAttempts.
     * Valid values are:
     * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
     * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
     * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
     * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
     *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
     * 
     */
    @Export(name="retryConditions", type=List.class, parameters={String.class})
    private Output<List<String>> retryConditions;

    /**
     * @return Specifies one or more retry conditions for the configured origin.
     * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
     * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
     * The default retryCondition is "CONNECT_FAILURE".
     * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
     * which may specify their own retryConditions and maxAttempts.
     * Valid values are:
     * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
     * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
     * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
     * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
     *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
     * 
     */
    public Output<List<String>> retryConditions() {
        return this.retryConditions;
    }
    /**
     * The connection and HTTP timeout configuration for this origin.
     * Structure is documented below.
     * 
     */
    @Export(name="timeout", type=EdgeCacheOriginTimeout.class, parameters={})
    private Output</* @Nullable */ EdgeCacheOriginTimeout> timeout;

    /**
     * @return The connection and HTTP timeout configuration for this origin.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ EdgeCacheOriginTimeout> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EdgeCacheOrigin(String name) {
        this(name, EdgeCacheOriginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EdgeCacheOrigin(String name, EdgeCacheOriginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EdgeCacheOrigin(String name, EdgeCacheOriginArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin", name, args == null ? EdgeCacheOriginArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EdgeCacheOrigin(String name, Output<String> id, @Nullable EdgeCacheOriginState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/edgeCacheOrigin:EdgeCacheOrigin", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EdgeCacheOrigin get(String name, Output<String> id, @Nullable EdgeCacheOriginState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EdgeCacheOrigin(name, id, state, options);
    }
}
