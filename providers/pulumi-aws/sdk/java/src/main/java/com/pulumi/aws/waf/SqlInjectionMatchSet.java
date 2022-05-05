// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.SqlInjectionMatchSetArgs;
import com.pulumi.aws.waf.inputs.SqlInjectionMatchSetState;
import com.pulumi.aws.waf.outputs.SqlInjectionMatchSetSqlInjectionMatchTuple;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF SQL Injection Match Set Resource
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
 *         var sqlInjectionMatchSet = new SqlInjectionMatchSet(&#34;sqlInjectionMatchSet&#34;, SqlInjectionMatchSetArgs.builder()        
 *             .sqlInjectionMatchTuples(SqlInjectionMatchSetSqlInjectionMatchTuple.builder()
 *                 .fieldToMatch(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch.builder()
 *                     .type(&#34;QUERY_STRING&#34;)
 *                     .build())
 *                 .textTransformation(&#34;URL_DECODE&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS WAF SQL Injection Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet")
public class SqlInjectionMatchSet extends com.pulumi.resources.CustomResource {
    /**
     * The name or description of the SQL Injection Match Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the SQL Injection Match Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @Export(name="sqlInjectionMatchTuples", type=List.class, parameters={SqlInjectionMatchSetSqlInjectionMatchTuple.class})
    private Output</* @Nullable */ List<SqlInjectionMatchSetSqlInjectionMatchTuple>> sqlInjectionMatchTuples;

    /**
     * @return The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    public Output<Optional<List<SqlInjectionMatchSetSqlInjectionMatchTuple>>> sqlInjectionMatchTuples() {
        return Codegen.optional(this.sqlInjectionMatchTuples);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlInjectionMatchSet(String name) {
        this(name, SqlInjectionMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlInjectionMatchSet(String name, @Nullable SqlInjectionMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlInjectionMatchSet(String name, @Nullable SqlInjectionMatchSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet", name, args == null ? SqlInjectionMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlInjectionMatchSet(String name, Output<String> id, @Nullable SqlInjectionMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet", name, state, makeResourceOptions(options, id));
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
    public static SqlInjectionMatchSet get(String name, Output<String> id, @Nullable SqlInjectionMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlInjectionMatchSet(name, id, state, options);
    }
}
