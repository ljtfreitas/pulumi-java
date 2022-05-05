// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticsearch.DomainSamlOptionsArgs;
import com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsState;
import com.pulumi.aws.elasticsearch.outputs.DomainSamlOptionsSamlOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages SAML authentication options for an AWS Elasticsearch Domain.
 * 
 * ## Example Usage
 * ### Basic Usage
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
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .elasticsearchVersion(&#34;1.5&#34;)
 *             .clusterConfig(DomainClusterConfig.builder()
 *                 .instanceType(&#34;r4.large.elasticsearch&#34;)
 *                 .build())
 *             .snapshotOptions(DomainSnapshotOptions.builder()
 *                 .automatedSnapshotStartHour(23)
 *                 .build())
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build());
 * 
 *         var exampleDomainSamlOptions = new DomainSamlOptions(&#34;exampleDomainSamlOptions&#34;, DomainSamlOptionsArgs.builder()        
 *             .domainName(exampleDomain.getDomainName())
 *             .samlOptions(DomainSamlOptionsSamlOptions.builder()
 *                 .enabled(true)
 *                 .idp(DomainSamlOptionsSamlOptionsIdp.builder()
 *                     .entityId(&#34;https://example.com&#34;)
 *                     .metadataContent(Files.readString(&#34;./saml-metadata.xml&#34;))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Elasticsearch domains can be imported using the `domain_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticsearch/domainSamlOptions:DomainSamlOptions example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:elasticsearch/domainSamlOptions:DomainSamlOptions")
public class DomainSamlOptions extends com.pulumi.resources.CustomResource {
    /**
     * Name of the domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    @Export(name="samlOptions", type=DomainSamlOptionsSamlOptions.class, parameters={})
    private Output</* @Nullable */ DomainSamlOptionsSamlOptions> samlOptions;

    /**
     * @return The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    public Output<Optional<DomainSamlOptionsSamlOptions>> samlOptions() {
        return Codegen.optional(this.samlOptions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainSamlOptions(String name) {
        this(name, DomainSamlOptionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainSamlOptions(String name, DomainSamlOptionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainSamlOptions(String name, DomainSamlOptionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domainSamlOptions:DomainSamlOptions", name, args == null ? DomainSamlOptionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainSamlOptions(String name, Output<String> id, @Nullable DomainSamlOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domainSamlOptions:DomainSamlOptions", name, state, makeResourceOptions(options, id));
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
    public static DomainSamlOptions get(String name, Output<String> id, @Nullable DomainSamlOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainSamlOptions(name, id, state, options);
    }
}
