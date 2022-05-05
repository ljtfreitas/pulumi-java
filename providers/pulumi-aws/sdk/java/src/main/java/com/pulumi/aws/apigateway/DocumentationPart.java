// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.DocumentationPartArgs;
import com.pulumi.aws.apigateway.inputs.DocumentationPartState;
import com.pulumi.aws.apigateway.outputs.DocumentationPartLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a settings of an API Gateway Documentation Part.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleRestApi = new RestApi(&#34;exampleRestApi&#34;);
 * 
 *         var exampleDocumentationPart = new DocumentationPart(&#34;exampleDocumentationPart&#34;, DocumentationPartArgs.builder()        
 *             .location(DocumentationPartLocation.builder()
 *                 .type(&#34;METHOD&#34;)
 *                 .method(&#34;GET&#34;)
 *                 .path(&#34;/example&#34;)
 *                 .build())
 *             .properties(&#34;{\&#34;description\&#34;:\&#34;Example description\&#34;}&#34;)
 *             .restApiId(exampleRestApi.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Gateway documentation_parts can be imported using `REST-API-ID/DOC-PART-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/documentationPart:DocumentationPart example 5i4e1ko720/3oyy3t
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/documentationPart:DocumentationPart")
public class DocumentationPart extends com.pulumi.resources.CustomResource {
    /**
     * The location of the targeted API entity of the to-be-created documentation part. See below.
     * 
     */
    @Export(name="location", type=DocumentationPartLocation.class, parameters={})
    private Output<DocumentationPartLocation> location;

    /**
     * @return The location of the targeted API entity of the to-be-created documentation part. See below.
     * 
     */
    public Output<DocumentationPartLocation> location() {
        return this.location;
    }
    /**
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., &#34;{ \&#34;description\&#34;: \&#34;The API does ...\&#34; }&#34;. Only Swagger-compliant key-value pairs can be exported and, hence, published.
     * 
     */
    @Export(name="properties", type=String.class, parameters={})
    private Output<String> properties;

    /**
     * @return A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., &#34;{ \&#34;description\&#34;: \&#34;The API does ...\&#34; }&#34;. Only Swagger-compliant key-value pairs can be exported and, hence, published.
     * 
     */
    public Output<String> properties() {
        return this.properties;
    }
    /**
     * The ID of the associated Rest API
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the associated Rest API
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DocumentationPart(String name) {
        this(name, DocumentationPartArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DocumentationPart(String name, DocumentationPartArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DocumentationPart(String name, DocumentationPartArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/documentationPart:DocumentationPart", name, args == null ? DocumentationPartArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DocumentationPart(String name, Output<String> id, @Nullable DocumentationPartState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/documentationPart:DocumentationPart", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static DocumentationPart get(String name, Output<String> id, @Nullable DocumentationPartState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DocumentationPart(name, id, state, options);
    }
}
